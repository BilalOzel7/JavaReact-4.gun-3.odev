package GameSimulation;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer=new Gamer(1,"Bilal","Özel",1989,"");
		
		GamerManager gameManager=new GamerManager(new UserValidationManager());
		gameManager.add(gamer);
		
		Sale sale1=new Sale(1,"Valorant",200);
		
		Campaign campaign1=new Campaign(1,"new account %50 discount","for a while");
		
		SaleManager saleManager=new SaleManager(gamer);
		saleManager.gameSale(gamer, campaign1);
		saleManager.addSale(sale1);
		saleManager.updateSale(sale1);
		saleManager.delete(sale1);
		
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		
		
	}

}

