package cn.edu.cqu.Recommend.Pojo;

import java.util.List;

public class CinemaSession {
	private Cinema cinema;
	private List<TimelySession> sessions;

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public List<TimelySession> getSessions() {
		return sessions;
	}

	public void setSessions(List<TimelySession> sessions) {
		this.sessions = sessions;
	}

	public CinemaSession(Cinema cinema, List<TimelySession> sessions) {
		super();
		this.cinema = cinema;
		this.sessions = sessions;
	}
}
