package jp.co.rakus.repository;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.rakus.domain.BaseballTeam;

@Repository
@Transactional
public class BaseballRepository {
	
	private static final RowMapper<BaseballTeam> BASEBAllTEAMROWMAPPER = (rs,i) ->{
		
		BaseballTeam baseballTeam = new BaseballTeam();
		
		baseballTeam.setId(rs.getInt("id"));
		baseballTeam.setLeagueName(rs.getString("league_name"));
		baseballTeam.setTeamName(rs.getString("team_name"));
		baseballTeam.setHeadquarters(rs.getString("headquarters"));
		baseballTeam.setInauguratation(rs.getString("inauguration"));
		baseballTeam.setHistory(rs.getString("history"));
		
		return baseballTeam;
	};
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public BaseballTeam load(Integer id) {
		
		String sql = "SELECT SELECT id,league_name,team_name,headquarters,inauguration,history FROM baseball_teams";	
		
		//System.out.println("load呼ばれた");
		return null;
	}
	public List<BaseballTeam> findAll(){
		
		String sql = "SELECT id,league_name,team_name,headquarters,inauguration,history FROM baseball_teams";
		
		List<BaseballTeam> baseballTeamList = template.query(sql,BASEBAllTEAMROWMAPPER);
		
		return  baseballTeamList;
		
	}
	
	

}
