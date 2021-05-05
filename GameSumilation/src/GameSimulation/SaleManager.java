package GameSimulation;

public class SaleManager implements SaleService {
	
	
	Gamer gamer;
	
	public SaleManager(Gamer gamer) {
		this.gamer=gamer;
	}

	
	public void gameSale(Gamer gamer,Campaign campaign) {
		System.out.println("Gamer Name"+ gamer.getFirstName()+ " "+ gamer.getLastName()+"bought the game with"+campaign.getCampaignName()+
				" " + campaign.getCampaignInfo());
	}

	@Override
	public void addSale(Sale sale) {
		System.out.println(gamer.getFirstName()+" oyuncusuna satis yapildi ");
		
	}

	@Override
	public void updateSale(Sale sale) {
		System.out.println("satis güncellendi :" + sale.gameName);
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println( "satis iptal edildi :" + sale.gameName);
		
	}

}
