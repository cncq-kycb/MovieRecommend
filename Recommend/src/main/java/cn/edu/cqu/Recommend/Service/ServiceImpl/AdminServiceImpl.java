package cn.edu.cqu.Recommend.Service.ServiceImpl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.edu.cqu.Recommend.Service.AdminService;
import cn.edu.cqu.Recommend.Utils.Utils;
import cn.edu.cqu.Recommend.Utils.Static.AdminStrings;

@Component
public class AdminServiceImpl implements AdminService {

	// 定时任务开关
	private boolean timerSwitch = false;

	@Override
	public String scheduleSwitchOn() {
		if (timerSwitch == false) {
			timerSwitch = true;
			return AdminStrings.TIMER_ON;
		}
		return AdminStrings.TIMER_ON_ERR;
	}

	@Override
	public String scheduleSwitchOff() {
		if (timerSwitch == true) {
			timerSwitch = false;
			return AdminStrings.TIMER_OFF;
		}
		return AdminStrings.TIMER_OFF_ERR;
	}

	// 每天00:00执行
	@Scheduled(cron = "0 0 0 * * ?")
	private void scheduledTask(int recommendSize) throws InterruptedException {
		if (timerSwitch == true) {
			// TODO: 插入定时任务
			String[] argv = new String[] { "/Users/alberto/anaconda3/bin/python",
					"./src/main/resources/Script/recommend/RecommendSys.py", recommendSize+"" };
			String result;
			try {
				result = Utils.cmdCall(argv);
				System.out.println(result);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
