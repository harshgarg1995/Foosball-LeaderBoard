package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private List<String> player1 = new ArrayList<String>();
	
	private List<String> player2 = new ArrayList<String>();
	
	private List<String> result = new ArrayList<String>();
	
	private List<Integer> score = new ArrayList<Integer>();

	public Team() {
		player1 = new ArrayList<String>();
		
		player2 = new ArrayList<String>();
		
		result = new ArrayList<String>();;
		
		score = new ArrayList<Integer>();
		
	}

	public List<String> getPlayer1() {
		return player1;
	}



	public void setPlayer1(List<String> player1) {
		this.player1 = player1;
	}



	public List<String> getPlayer2() {
		return player2;
	}



	public void setPlayer2(List<String> player2) {
		this.player2 = player2;
	}



	public List<String> getResult() {
		return result;
	}



	public void setResult(List<String> result) {
		this.result = result;
	}



	public List<Integer> getScore() {
		return score;
	}



	public void setScore(List<Integer> score) {
		this.score = score;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Team [player1=");
		builder.append(player1);
		builder.append(", player2=");
		builder.append(player2);
		builder.append(", result=");
		builder.append(result);
		builder.append(", score=");
		builder.append(score);
		builder.append("]");
		return builder.toString();
	}
}
