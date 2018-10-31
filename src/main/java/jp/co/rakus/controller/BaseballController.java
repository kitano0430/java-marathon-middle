package jp.co.rakus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.BaseballTeam;
import jp.co.rakus.repository.BaseballRepository;

@Controller
@RequestMapping("/baseball")
public class BaseballController {

	@Autowired
	private BaseballRepository repository;

	@RequestMapping("/toTeamList")
	public String toTeamList(Model model) {

		List<BaseballTeam> teamList = repository.findAll();
		model.addAttribute("teamList", teamList);

		return "baseballTeamList";
	}

}
