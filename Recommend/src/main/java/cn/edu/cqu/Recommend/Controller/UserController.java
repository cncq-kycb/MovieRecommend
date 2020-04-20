package cn.edu.cqu.Recommend.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.cqu.Recommend.Service.ActionService;
import cn.edu.cqu.Recommend.Service.UserService;
import cn.edu.cqu.Recommend.Utils.MyJson;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	ActionService actionService;

	// 获取用户信息
	@GetMapping(value = "/getUserInfo")
	@ResponseBody
	public MyJson getUserInfo(HttpSession session) {
		return userService.getUserInfo(session);
	}

	// 获取全部电影信息
	@GetMapping(value = "/getMovies")
	@ResponseBody
	public MyJson getMovies() {
		return userService.getMovies();
	}

	// 搜索电影信息
	@GetMapping("searchMovie")
	@ResponseBody
	public MyJson searchMovie(@RequestParam(required = true, value = "input") String input) {
		return userService.searchMovie(input);
	}

	// 获取今日电影场次信息
	@GetMapping(value = "/getSessionInfoToday")
	@ResponseBody
	public MyJson getSessionInfoToday(@RequestParam(required = true, value = "movieId") Integer movieId,
			HttpSession session) {
		actionService.viewLog(session, movieId);
		return userService.getTimelySession(movieId, "TODAY");
	}

	// 获取明日电影场次信息
	@GetMapping(value = "/getSessionInfoTomorrow")
	@ResponseBody
	public MyJson getSessionInfoTomorrow(@RequestParam(required = true, value = "movieId") Integer movieId,
			HttpSession session) {
		actionService.viewLog(session, movieId);
		return userService.getTimelySession(movieId, "TOMORROW");
	}

}
