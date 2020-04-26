package cn.edu.cqu.Recommend.Service;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {

	// type=1: 爬虫开关
	// type=2: 推荐开关

	// 开启定时任务
	public String scheduleSwitchOn(int type);

	// 关闭定时任务
	public String scheduleSwitchOff(int type);

}
