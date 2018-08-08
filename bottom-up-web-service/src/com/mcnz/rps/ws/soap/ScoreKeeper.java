package com.mcnz.rps.ws.soap;

public class ScoreKeeper {
	
	public int getWins() {
		return Score.WINS;
	}
	
	public int getTies() {
		return Score.TIES;
	}
	
	public int getLosses() {
		return Score.LOSSES;
	}
	
	public int increaseWins() {
		return ++Score.WINS;
	}
	
	public int increaseTies() {
		return ++Score.TIES;
	}
	
	public int increaseLosses() {
		return ++Score.LOSSES;
	}

}
