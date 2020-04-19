package cn.edu.cqu.Recommend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	// 首页
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	// 跳转到首页
	@RequestMapping("/index.html")
	public String gotoIndex() {
		return "index";
	}

	// 跳转到发现页面
	@RequestMapping("/find.html")
	public String gotoFind() {
		return "find";
	}

	// 跳转到我的页面
	@RequestMapping("/my.html")
	public String gotoMy() {
		return "my";
	}

	// 跳转到登录页面
	@RequestMapping("/login.html")
	public String gotoLogin() {
		return "login";
	}

	// 跳转到注册页面
	@RequestMapping("/signup.html")
	public String gotoSignup() {
		return "signup";
	}

	// 跳转到搜索页面
	@RequestMapping("seacher.html")
	public String gotoSearch() {
		return "seacher";
	}

}
