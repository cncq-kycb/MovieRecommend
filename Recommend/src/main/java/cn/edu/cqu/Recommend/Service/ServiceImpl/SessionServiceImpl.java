package cn.edu.cqu.Recommend.Service.ServiceImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.cqu.Recommend.Dao.TimelySessionMapper;
import cn.edu.cqu.Recommend.Pojo.TimelySession;
import cn.edu.cqu.Recommend.Pojo.TimelySessionExample;
import cn.edu.cqu.Recommend.Service.SessionService;
import cn.edu.cqu.Recommend.Utils.MyJson;
import cn.edu.cqu.Recommend.Utils.Static.ErrInfoStrings;

@Component
public class SessionServiceImpl implements SessionService {

	private final String TODAY = "TODAY";
	private final String TOMORROW = "TOMORROW";

	@Autowired
	TimelySessionMapper timelySessionMapper;

	@SuppressWarnings({ "deprecation", "static-access" })
	@Override
	public MyJson getTimelySession(String condition) {
		TimelySessionExample timelySessionExample = new TimelySessionExample();
		Date time_now = new Date();
		if (condition.equals(TODAY)) {
			// 查询今日有效电影场次
			timelySessionExample.or().andSessionStartGreaterThanOrEqualTo(time_now).andSessionStartLessThan(
					new Date(time_now.getYear(), time_now.getMonth(), time_now.getDate(), 23, 59, 59));
		} else if (condition.equals(TOMORROW)) {
			// 查询明日有效电影场次
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(time_now);
			calendar.add(calendar.DATE, 1);
			time_now = calendar.getTime();
			timelySessionExample.or().andSessionStartBetween(
					new Date(time_now.getYear(), time_now.getMonth(), time_now.getDate(), 00, 00, 00),
					new Date(time_now.getYear(), time_now.getMonth(), time_now.getDate(), 23, 59, 59));
		}
		try {
			List<TimelySession> timelySessions = timelySessionMapper.selectByExample(timelySessionExample);
			return new MyJson(true, timelySessions);
		} catch (Exception e) {
			System.err.println(e);
			return new MyJson(false, ErrInfoStrings.DATABASE_ERR);
		}
	}

}
