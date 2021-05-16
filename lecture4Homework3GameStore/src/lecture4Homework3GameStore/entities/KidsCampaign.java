package lecture4Homework3GameStore.entities;

import lecture4Homework3GameStore.abstracts.Entity;

public class KidsCampaign  extends Campaign implements Entity{
	private int id;
	
	public KidsCampaign() {
		
	}

	public KidsCampaign(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
