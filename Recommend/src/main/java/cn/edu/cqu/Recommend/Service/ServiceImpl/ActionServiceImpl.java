package cn.edu.cqu.Recommend.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.cqu.Recommend.Dao.UserMapper;
import cn.edu.cqu.Recommend.Service.ActionService;

@Component
public class ActionServiceImpl implements ActionService {

	@Autowired
	UserMapper userMapper;

}
