package com.pluralsight.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pluralsight.model.SaveTeam;
import com.pluralsight.service.GameService;


@Controller
@RequestMapping(value="/leaderBoard")
public class LeaderBoardController {
	
	@Autowired
	private GameService gameService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayBoard(Model model) {
		
		List<SaveTeam> st = gameService.findTopTenTeams();
		model.addAttribute("topTenTeams", st);
		
		return "leaderBoard";
	}
	

}
