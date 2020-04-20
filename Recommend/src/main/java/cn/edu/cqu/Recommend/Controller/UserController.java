package cn.edu.cqu.Recommend.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.cqu.Recommend.Service.UserService;
import cn.edu.cqu.Recommend.Utils.MyJson;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	// 获取用户信息
	@GetMapping(value = "/getUserInfo")
	@ResponseBody
	public MyJson getUserInfo(HttpSession session) {
		return userService.getUserInfo(session);
	}

	// 获取今日电影场次信息
	@GetMapping(value = "/getSessionInfoToday")
	@ResponseBody
	public MyJson getSessionInfoToday(@RequestParam(required = true, value = "movieId") Integer movieId) {
		return userService.getTimelySession(movieId, "TODAY");
	}

	// 获取明日电影场次信息
	@GetMapping(value = "/getSessionInfoTomorrow")
	@ResponseBody
	public MyJson getSessionInfoTomorrow(@RequestParam(required = true, value = "movieId") Integer movieId) {
		return userService.getTimelySession(movieId, "TOMORROW");
	}

}
