package cn.edu.cqu.Recommend.Service.ServiceImpl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.edu.cqu.Recommend.Service.AdminService;
import cn.edu.cqu.Recommend.Utils.Utils;
import cn.edu.cqu.Recommend.Utils.Static.AdminStrings;

@Component
public class AdminServiceImpl implements AdminService {

	// 定时任务开关
	private boolean timerSwitchSpider = false;
	private boolean timerSwitchRecommend = false;
	// 推荐个数
	private int recommendSize = 10;

	@Override
	public String scheduleSwitchOn(int type) {
		switch (type) {
		case 1:
			if (this.timerSwitchSpider == false) {
				this.timerSwitchSpider = true;
				return AdminStrings.TIMER_ON_SPIDER;
			}
			break;
		case 2:
			if (this.timerSwitchRecommend == false) {
				this.timerSwitchRecommend = true;
				return AdminStrings.TIMER_ON_RECOMMEND;
			}
			break;
		default:
			break;
		}
		return AdminStrings.TIMER_ON_ERR;
	}

	@Override
	public String scheduleSwitchOff(int type) {
		switch (type) {
		case 1:
			if (this.timerSwitchSpider == true) {
				this.timerSwitchSpider = false;
				return AdminStrings.TIMER_OFF_SPIDER;
			}
			break;
		case 2:
			if (this.timerSwitchRecommend == true) {
				this.timerSwitchRecommend = false;
				return AdminStrings.TIMER_OFF_RECOMMEND;
			}
			break;
		default:
			break;
		}
		return AdminStrings.TIMER_OFF_ERR;
	}

	// 爬虫任务
	// 每天00:00执行
	// @Scheduled(cron = "0 0 0 * * ?")
	// 演示用每隔1000 * n秒执行一次任务
	@Scheduled(fixedDelay = 1000 * 10)
	private void scheduledSpiderTask() throws InterruptedException {
		if (this.timerSwitchSpider == true) {
			// TODO: 插入定时任务
			String[] argv = new String[] { "/Users/alberto/anaconda3/bin/python",
					"./src/main/resources/Script/spider/getMovieInfo.py"};
			String result;
			try {
				result = Utils.cmdCall(argv);
				System.out.println(result);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// 推荐任务
	// 每天00:00执行
	// @Scheduled(cron = "0 0 0 * * ?")
	// 演示用每隔1000 * n秒执行一次任务
	@Scheduled(fixedDelay = 1000 * 10)
	private void scheduledRecommendTask() throws InterruptedException {
		if (this.timerSwitchRecommend == true) {
			// TODO: 插入定时任务
			String[] argv = new String[] { "/Users/alberto/anaconda3/bin/python",
					"./src/main/resources/Script/recommend/RecommendSys.py", this.recommendSize + "" };
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
