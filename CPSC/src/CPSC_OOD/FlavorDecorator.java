package CPSC_OOD;

public abstract class FlavorDecorator implements Cake {
	
	 public FlavorDecorator() {
		super();
		// TODO Auto-generated constructor stub
	}
	Cake specialCake;
	
	public FlavorDecorator(Cake specialCake) {
		this.specialCake = specialCake;
	}
	public String getDescription() {
		return specialCake.getDescription();
	}
	

}
