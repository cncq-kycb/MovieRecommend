package cn.edu.cqu.Recommend.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.cqu.Recommend.Pojo.User;
import cn.edu.cqu.Recommend.Service.ActionService;
import cn.edu.cqu.Recommend.Service.UserService;
import cn.edu.cqu.Recommend.Utils.MyJson;
import cn.edu.cqu.Recommend.Utils.Static.LogioStrings;

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
	public MyJson getMovies(@RequestParam(required = true, value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(required = false, value = "pageSize", defaultValue = "5") int pageSize) {
		return userService.getMovies(pageNum, pageSize);
	}

	// 获取有场次电影信息
	@GetMapping(value = "/getTimelyMovie")
	@ResponseBody
	public MyJson getTimelyMovie() {
		return userService.getTimelyMovie();
	}

	// 根据电影ID获取电影信息
	@GetMapping(value = "/getMovie")
	@ResponseBody
	public MyJson getMovie(@RequestParam(required = true, value = "movieId") Integer movieId, HttpSession session) {
		if (session.getAttribute("user") == null) {
			// 未登录
			return new MyJson(true, LogioStrings.NOT_LOGIN);
		}
		return userService.getMovieById(movieId);
	}

	// 搜索电影信息
	@GetMapping("searchMovie")
	@ResponseBody
	public MyJson searchMovie(@RequestParam(required = true, value = "input") String input, HttpSession session) {
		actionService.searchLog(session, input);
		return userService.searchMovie(input);
	}

	// 获取今日电影场次信息
	@GetMapping(value = "/getSessionInfoToday")
	@ResponseBody
	public MyJson getSessionInfoToday(@RequestParam(required = true, value = "movieId") Integer movieId,
			HttpSession session) {
		if (session.getAttribute("user") == null) {
			// 未登录
			return new MyJson(true, LogioStrings.NOT_LOGIN);
		}
		actionService.viewLog(session, movieId);
		return userService.getTimelySession(movieId, "TODAY");
	}

	// 获取明日电影场次信息
	@GetMapping(value = "/getSessionInfoTomorrow")
	@ResponseBody
	public MyJson getSessionInfoTomorrow(@RequestParam(required = true, value = "movieId") Integer movieId,
			HttpSession session) {
		if (session.getAttribute("user") == null) {
			// 未登录
			return new MyJson(true, LogioStrings.NOT_LOGIN);
		}
		actionService.viewLog(session, movieId);
		return userService.getTimelySession(movieId, "TOMORROW");
	}

	// 获取电影推荐
	@GetMapping(value = "getRecommendMovies")
	@ResponseBody
	public MyJson getRecommendMovies(HttpSession session) {
		// 随机推荐
		// return userService.getRecommendMovies();
		// 数据推荐
		return userService.getRecommendMovies(session);
	}

	// 添加收藏
	@PostMapping(value = "addFavorite")
	@ResponseBody
	public MyJson addFavorite(Integer movieId, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			// 未登录
			return new MyJson(true, LogioStrings.NOT_LOGIN);
		}
		return userService.addFavorite(movieId, user);
	}

	// 取消收藏
	@PostMapping(value = "removeFavorite")
	@ResponseBody
	public MyJson removeFavorite(Integer movieId, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			// 未登录
			return new MyJson(true, LogioStrings.NOT_LOGIN);
		}
		return userService.removeFavorite(user);
	}

	// 获取收藏列表
	@GetMapping(value = "getFavorite")
	@ResponseBody
	public MyJson getFavorite(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			// 未登录
			return new MyJson(true, LogioStrings.NOT_LOGIN);
		}
		return userService.getFavorite(user);
	}

	// 判断是否为已收藏
	@GetMapping(value = "isFavorite")
	@ResponseBody
	public MyJson isFavorite(@RequestParam(required = true, value = "movieId") Integer movieId, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			// 未登录
			return new MyJson(true, LogioStrings.NOT_LOGIN);
		}
		return userService.isFavorite(movieId, user);
	}
}
