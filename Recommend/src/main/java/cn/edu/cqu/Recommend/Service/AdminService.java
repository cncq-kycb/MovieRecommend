package cn.edu.cqu.Recommend.Service;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {

	// 开启定时任务
	public String scheduleSwitchOn();

	// 关闭定时任务
	public String scheduleSwitchOff();

}
