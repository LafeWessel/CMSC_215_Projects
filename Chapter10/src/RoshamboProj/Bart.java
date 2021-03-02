package RoshamboProj;

public class Bart extends Player{

	
	
	Bart(){
		name = "Bart";
	}
	
	@Override
	public void generateRoshambo() {
		roshambo =  Roshambo.ROCK;
	}
	
	@Override
	public Roshambo getRoshambo() {
		generateRoshambo();
		return roshambo;
	}
}
