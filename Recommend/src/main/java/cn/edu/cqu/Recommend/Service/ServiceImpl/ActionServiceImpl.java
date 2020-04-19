package cn.edu.cqu.Recommend.Service.ServiceImpl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.cqu.Recommend.Dao.UserMapper;
import cn.edu.cqu.Recommend.Pojo.User;
import cn.edu.cqu.Recommend.Pojo.UserExample;
import cn.edu.cqu.Recommend.Service.ActionService;
import cn.edu.cqu.Recommend.Utils.MyJson;
import cn.edu.cqu.Recommend.Utils.Static.LogioStrings;

@Component
public class ActionServiceImpl implements ActionService {

	@Autowired
	UserMapper userMapper;

	@Override
	public MyJson login(User user, HttpSession session) {
		UserExample userExample = new UserExample();
		userExample.or().andUserTelEqualTo(user.getUserTel());
		List<User> users = userMapper.selectByExample(userExample);
		if (users.size() == 0) {
			// 无此账号
			return new MyJson(false, LogioStrings.NO_ACCOUNT, new Date().getTime());
		}
		if (!user.getUserPassword().equals(users.get(0).getUserPassword())) {
			// 密码错误
			return new MyJson(false, LogioStrings.WRONG_PASSWORD, new Date().getTime());
		}
		// 密码正确，建立session
		session.setAttribute("user", user);
		return new MyJson(true, LogioStrings.LOGIN_SUCCESS, new Date().getTime());
	}

	@Override
	public MyJson logout(HttpSession session) {
		session.invalidate();
		return new MyJson(true, LogioStrings.LOGOUT_SUCCESS, new Date().getTime());
	}

}
