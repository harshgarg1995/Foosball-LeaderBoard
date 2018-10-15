//package com.pluralsight.model;
//
//public class Request {
//	
//	private Team team1;
//	
//	private Team team2;
//
//	private String team1Player1;
//	
//	public Team getTeam1() {
//		return team1;
//	}
//
//	public Team getTeam2() {
//		return team2;
//	}
//	
//	public void setTeam1Player1(String team1Player1) {
//		this.team1.setPlayer1(team1Player1);
//	}
//
//	public void setTeam1Player2(String team1Player2) {
//		this.team1.setPlayer2(team1Player2);
//	}
//
//	public void setTeam1Result(String team1Result) {
//		this.team1.setResult(team1Result);
//	}
//
//	public void setTeam1Score(int team1Score) {
//		this.team1.setScore(team1Score);
//	}
//	
//	public void setPlayer1(String team2Player1) {
//		this.team2.setPlayer1(team2Player1);
//	}
//
//	public void setTeam2Player2(String team2Player2) {
//		this.team2.setPlayer2(team2Player2);
//	}
//
//	public void setTeam2Result(String team2Result) {
//		this.team2.setResult(team2Result);
//	}
//
//	public void setTeam2Score(int team2Score) {
//		this.team2.setScore(team2Score);
//	}
//	
//	///////////////////////////////////////////////////////////////////////////////
//	
//	
//	public String getTeam1Player1() {
//		return team1.getPlayer1();
//	}
//
//	public String getTeam1Player2() {
//		return team1.getPlayer2();
//	}
//
//	public String getTeam1Result() {
//		return team1.getResult();
//	}
//
//	public int getTeam1Score() {
//		return team1.getScore();
//	}
//
//	public String getTeam2Player1() {
//		return team2.getPlayer1();
//	}
//
//	public String getTeam2Player2() {
//		return team2.getPlayer2();
//	}
//
//	public String getTeam2Result() {
//		return team2.getResult();
//	}
//
//	public int getTeam2Score() {
//		return team2.getScore();
//	}
//
//
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Request [team1=");
//		builder.append(team1);
//		builder.append(", team2=");
//		builder.append(team2);
//		builder.append("]");
//		return builder.toString();
//	}
//
//}
