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
	@RequestMapping("/index")
	public String gotoIndex() {
		return "index";
	}

}
