package jp.co.rakus.domain;

public class BaseballTeam {

	private Integer id;
	private String leagueName;
	private String teamName;
	private String headquarters;
	private String inauguratation;
	private String history;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getInauguratation() {
		return inauguratation;
	}

	public void setInauguratation(String inauguratation) {
		this.inauguratation = inauguratation;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

}
