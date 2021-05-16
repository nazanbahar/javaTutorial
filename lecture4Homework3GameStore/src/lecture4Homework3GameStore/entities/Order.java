package lecture4Homework3GameStore.entities;

import java.time.LocalDate;

import lecture4Homework3GameStore.abstracts.Entity;

public class Order implements Entity{
	private int id;
	private int customerId;
	private int campaignId;
	private int gameId;
	private LocalDate orderDate;
	
	public Order(){
		
	}

	public Order(int id, int customerId, int campaignId, int gameId, LocalDate orderDate) {
		this.id = id;
		this.customerId = customerId;
		this.campaignId = campaignId;
		this.gameId = gameId;
		this.orderDate = orderDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
