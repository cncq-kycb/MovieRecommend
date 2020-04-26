package cn.edu.cqu.Recommend.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.cqu.Recommend.Pojo.User;
import cn.edu.cqu.Recommend.Service.ActionService;
import cn.edu.cqu.Recommend.Service.AdminService;
import cn.edu.cqu.Recommend.Utils.MyJson;

@RestController
public class ActionController {

	@Autowired
	ActionService actionService;
	@Autowired
	AdminService adminService;

	// 登录请求
	@PostMapping(value = "/login")
	@ResponseBody
	public MyJson login(User user, HttpSession session) {
		return actionService.login(user, session);
	}

	// 登出请求
	@GetMapping(value = "/logout")
	@ResponseBody
	public MyJson logout(HttpSession session) {
		return actionService.logout(session);
	}

	// 注册请求
	@PostMapping(value = "/signup")
	@ResponseBody
	public MyJson signup(User user) {
		return actionService.signup(user);
	}

	// 开启爬虫任务
	@RequestMapping(value = "/spiderScheduleSwitchOn")
	@ResponseBody
	public String spiderScheduleSwitchOn() {
		return adminService.scheduleSwitchOn(1);
	}

	// 关闭爬虫任务
	@RequestMapping(value = "/spiderScheduleSwitchOff")
	@ResponseBody
	public String spiderScheduleSwitchOff() {
		return adminService.scheduleSwitchOff(1);
	}

	// 开启推荐任务
	@RequestMapping(value = "/recommendScheduleSwitchOn")
	@ResponseBody
	public String recommendScheduleSwitchOn() {
		return adminService.scheduleSwitchOn(2);
	}

	// 关闭推荐任务
	@RequestMapping(value = "/recommendScheduleSwitchOff")
	@ResponseBody
	public String recommendScheduleSwitchOff() {
		return adminService.scheduleSwitchOff(2);
	}
}
