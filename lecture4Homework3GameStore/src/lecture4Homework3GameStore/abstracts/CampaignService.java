package lecture4Homework3GameStore.abstracts;

import lecture4Homework3GameStore.entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
