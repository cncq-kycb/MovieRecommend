package cn.edu.cqu.Recommend.Service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import cn.edu.cqu.Recommend.Pojo.User;
import cn.edu.cqu.Recommend.Utils.MyJson;

@Service
public interface ActionService {

	// 登陆服务
	MyJson login(User user, HttpSession session);

	// 登出服务
	MyJson logout(HttpSession session);

	// 注册服务
	MyJson signup(User user);

	// 记录浏览电影详情日志
	boolean viewLog(HttpSession session, Integer movieId);

}
