package lecture4Homework3GameStore.entities;

import lecture4Homework3GameStore.abstracts.Entity;

public class CorporateCampaign extends Campaign implements Entity {
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
