package RoshamboProj;

public class Lisa extends Player{

	
	Lisa(){
		name = "Lisa";
	}
	
	@Override
	public void generateRoshambo() {
		
		//Gets a random number between 0 and 2
		int choice = (int)(Math.random() * 3);
		
		switch (choice) {
		case 0:
			roshambo = Roshambo.ROCK;
			break;
		case 1:
			roshambo = Roshambo.PAPER;
			break;
		case 2:
			roshambo = Roshambo.SCISSORS;
			break;
		default:
			System.out.println("Error: invalid choice");
		}
	}
	
	//generates a new choice every time that roshambo is retrieved
	@Override
	public Roshambo getRoshambo() {
		generateRoshambo();
		return roshambo;
	}

}
