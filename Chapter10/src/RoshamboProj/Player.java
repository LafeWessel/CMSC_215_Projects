package RoshamboProj;

public abstract class Player {
	
	protected Roshambo roshambo;
	protected String name;
	
	public abstract void generateRoshambo();
	
	public Roshambo getRoshambo() {
		return roshambo;
	}
	public String getName() {
		return name;
	}
	
	public void setRoshambo(Roshambo r) {
		roshambo = r;
	}
	public void setName(String name) {
		this.name = name;
	}
}
