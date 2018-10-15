package com.pluralsight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.pluralsight.model.Request;
import com.pluralsight.model.Team;
import com.pluralsight.service.GameService;


@Controller
@RequestMapping(value="/playGame")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String beforeGame(@ModelAttribute ("team") Team request) {
		

		
		return "playGame";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String afterGame(@ModelAttribute ("team") Team team) {
		
		System.out.println(team);
		
		
		gameService.save(team);
		
		team.setPlayer1(null);
		team.setPlayer2(null);
		team.setScore(null);
		
		
		return "playGame";
	}

}
