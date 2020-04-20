package cn.edu.cqu.Recommend.Service;

import org.springframework.stereotype.Service;

import cn.edu.cqu.Recommend.Utils.MyJson;

@Service
public interface SessionService {

	// 按日期条件获取电影场次信息
	public MyJson getTimelySession(String condition);

}
