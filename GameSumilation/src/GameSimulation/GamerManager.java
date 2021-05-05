package GameSimulation;

public class GamerManager implements GamerService  {
	
	UserValidationService userValidationService;
	
	public GamerManager(UserValidationService userValidationService) {
		super();
		this.userValidationService=userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userValidationService.checkIfRealPerson(gamer)==true) {
			System.out.println("Gamer Added :" + gamer.getFirstName()+" "+ gamer.getLastName());
			
		} else {
			System.out.println("Gamer not Added :" + gamer.getFirstName()+" "+ gamer.getLastName());
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if (userValidationService.checkIfRealPerson(gamer)==true) {
			System.out.println("Gamer Updated :" + gamer.getFirstName()+" "+ gamer.getLastName());
			
		} else {
			System.out.println("Gamer not Updated :" + gamer.getFirstName()+" "+ gamer.getLastName());
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if (userValidationService.checkIfRealPerson(gamer)==true) {
			System.out.println("Gamer Deleted :" + gamer.getFirstName()+" "+ gamer.getLastName());
			
		} else {
			System.out.println("Gamer not Deleted :" + gamer.getFirstName()+" "+ gamer.getLastName());
		}
		
	}


}
