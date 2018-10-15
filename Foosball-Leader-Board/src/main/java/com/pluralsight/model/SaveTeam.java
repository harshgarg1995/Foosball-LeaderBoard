package com.pluralsight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="saveteam")
public class SaveTeam {
	@Id               // primary key
	@Column(name="teamName")
	private String teamName="";
	
	@Column(name="score")
	private int score=0 ;

	
	public SaveTeam(String teamName, int score) {
		
		this.teamName = teamName;
		this.score = score;
	}
	
	public SaveTeam() {}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
	
	

}
