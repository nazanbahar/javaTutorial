package Entities;

public class CorporateCampaign extends Campaign {
	private int id;
	
	
	public CorporateCampaign() {
		
	}


	public CorporateCampaign(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
}
