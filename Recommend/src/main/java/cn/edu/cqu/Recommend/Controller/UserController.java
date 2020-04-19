package cn.edu.cqu.Recommend.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
