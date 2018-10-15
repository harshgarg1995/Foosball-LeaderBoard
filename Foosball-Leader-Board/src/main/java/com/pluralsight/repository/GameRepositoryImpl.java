package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.SaveTeam;
import com.pluralsight.model.Team;

@Repository("gameRepository")
public class GameRepositoryImpl implements GameRepository {

	
	private SaveTeam saveTeam = new SaveTeam("",0);
	
	@PersistenceContext
	private EntityManager em;
	
	private String teamName = "";
	private String firstName="";
	private String lastName="";
	 
	public Team save(Team team) {
		
		firstName=team.getPlayer1().get(0).toLowerCase();
		lastName=team.getPlayer2().get(0).toLowerCase();
		
		if(firstName.compareTo(lastName) <0)
			teamName=firstName+","+lastName;
		else if(firstName.compareTo(lastName) >=0)
			teamName=lastName+","+firstName;
		
		
		
		saveTeam.setTeamName(teamName);
		saveTeam.setScore(team.getScore().get(0));
	
		
		 SaveTeam st = em.find(SaveTeam.class, teamName);
	    
		
	    if(st == null) {
	    	em.persist(saveTeam);
			em.flush();
	    }
	    else if(st!=null) {
	    	saveTeam.setScore(team.getScore().get(0)+st.getScore());
	    	em.merge(saveTeam);
	    }
	    
	    
	  
	    firstName=team.getPlayer1().get(1).toLowerCase();
		lastName=team.getPlayer2().get(1).toLowerCase();
		
		if(firstName.compareTo(lastName) <0)
			teamName=firstName+","+lastName;
		else if(firstName.compareTo(lastName) >=0)
			teamName=lastName+","+firstName;
	    
	    saveTeam = new SaveTeam("",0);
		saveTeam.setTeamName(teamName);
		saveTeam.setScore(team.getScore().get(1));
		
		em.flush();
		
		st = em.find(SaveTeam.class, teamName);
		
		 if(st == null) {
		    	em.persist(saveTeam);
				em.flush();
		    }
		    else if(st!=null) {
		    	saveTeam.setScore(team.getScore().get(1)+st.getScore());
		    	em.merge(saveTeam);
		    }
		
	    
		return team;
	}

	@SuppressWarnings("unchecked")
	public List<SaveTeam> findTopTenTeams() {
		
		Query	query= em.createQuery("Select new com.pluralsight.model.SaveTeam(st.teamName, st.score) " +
				"from SaveTeam st ORDER BY st.score DESC").setMaxResults(10);
		return query.getResultList();
		
		
	}

}
