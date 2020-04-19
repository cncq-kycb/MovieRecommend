package cn.edu.cqu.Recommend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.cqu.Recommend.Service.ActionService;

@RestController
public class ActionController {

	@Autowired
	ActionService actionService;

}
