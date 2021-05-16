package lecture4Homework3GameStore.entities;

import lecture4Homework3GameStore.abstracts.Entity;

public class Game implements Entity{
	private int id;
	private int gameCode;
	private String name;
	private double unitPrice;
	
public Game() {
		
	}

	public Game(int id, int gameCode, String name, double unitPrice) {
		this.id = id;
		this.gameCode = gameCode;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameCode() {
		return gameCode;
	}

	public void setGameCode(int gameCode) {
		this.gameCode = gameCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
