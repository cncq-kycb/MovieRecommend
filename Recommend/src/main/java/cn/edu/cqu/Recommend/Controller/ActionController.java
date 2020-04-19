package cn.edu.cqu.Recommend.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.cqu.Recommend.Pojo.User;
import cn.edu.cqu.Recommend.Service.ActionService;
import cn.edu.cqu.Recommend.Utils.MyJson;

@RestController
public class ActionController {

	@Autowired
	ActionService actionService;

	// 登录请求
	@PostMapping(value = "/login")
	@ResponseBody
	public MyJson login(User user, HttpSession session) {
		return actionService.login(user, session);
	}

	// 登出请求
	@PostMapping(value = "/logout")
	@ResponseBody
	public MyJson logout(User user, HttpSession session) {
		return actionService.logout(session);
	}

	// 注册请求
	@PostMapping(value = "/signup")
	@ResponseBody
	public MyJson signup(User user) {
		return actionService.signup(user);
	}
}
