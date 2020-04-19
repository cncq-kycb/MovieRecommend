package cn.edu.cqu.Recommend.Service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import cn.edu.cqu.Recommend.Utils.MyJson;

@Service
public interface UserService {

	// 获取用户信息
	MyJson getUserInfo(HttpSession session);

}
