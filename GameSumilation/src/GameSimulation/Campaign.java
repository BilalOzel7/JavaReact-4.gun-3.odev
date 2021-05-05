package GameSimulation;

public class Campaign {
	int campaignId;
	String campaignName;
	String campaignInfo;
	
	public Campaign(int campaignId, String campaignName, String campaignInfo) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignInfo = campaignInfo;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignInfo() {
		return campaignInfo;
	}

	public void setCampaignInfo(String campaignInfo) {
		this.campaignInfo = campaignInfo;
	}	
}
