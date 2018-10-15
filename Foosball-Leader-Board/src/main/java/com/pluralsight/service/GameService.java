package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.SaveTeam;
import com.pluralsight.model.Team;

public interface GameService {
	
	Team save(Team team);

	public List<SaveTeam> findTopTenTeams();
}
