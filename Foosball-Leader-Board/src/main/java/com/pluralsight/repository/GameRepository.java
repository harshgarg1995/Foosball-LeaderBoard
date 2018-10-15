package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.SaveTeam;
import com.pluralsight.model.Team;

public interface GameRepository {

	Team save(Team team);

	List<SaveTeam> findTopTenTeams();

	

}
