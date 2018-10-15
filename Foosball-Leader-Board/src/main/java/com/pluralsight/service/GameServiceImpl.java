package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.SaveTeam;
import com.pluralsight.model.Team;
import com.pluralsight.repository.GameRepository;

@Service("gameService")
public class GameServiceImpl implements GameService{
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public Team save(Team team) {
		return gameRepository.save(team);
	}

	public List<SaveTeam> findTopTenTeams() {
		// TODO Auto-generated method stub
		return gameRepository.findTopTenTeams();
	}

}
