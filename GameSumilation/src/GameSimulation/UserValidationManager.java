package GameSimulation;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		if (gamer.getFirstName()=="Bilal" && gamer.getLastName()=="Özel") {
			System.out.println("Gamer Valid");
			return true;
			
		} else {
			System.out.println("Gamer not valid");
	        return false;
		}
	}
}
