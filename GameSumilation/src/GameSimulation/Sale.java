package GameSimulation;

public class Sale {
	int saleId;
	String gameName;
	double price;
	
	public Sale(int saleId, String gameName, double price) {
		super();
		this.saleId = saleId;
		this.gameName = gameName;
		this.price = price;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
