package cn.edu.cqu.Recommend.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.cqu.Recommend.Dao.MovieInfoMapper;
import cn.edu.cqu.Recommend.Dao.SessionInfoMapper;
import cn.edu.cqu.Recommend.Service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	MovieInfoMapper movieInfoMapper;
	@Autowired
	SessionInfoMapper sessionInfoMapper;
}
