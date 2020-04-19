package cn.edu.cqu.Recommend.Service.ServiceImpl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.cqu.Recommend.Dao.MovieInfoMapper;
import cn.edu.cqu.Recommend.Dao.SessionInfoMapper;
import cn.edu.cqu.Recommend.Pojo.User;
import cn.edu.cqu.Recommend.Service.UserService;
import cn.edu.cqu.Recommend.Utils.MyJson;
import cn.edu.cqu.Recommend.Utils.Static.LogioStrings;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	MovieInfoMapper movieInfoMapper;
	@Autowired
	SessionInfoMapper sessionInfoMapper;

	@Override
	public MyJson getUserInfo(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			// 未登录用户
			return new MyJson(false, LogioStrings.NOT_LOGIN);
		}
		// 已登录用户
		return new MyJson(true, user);
	}
}
