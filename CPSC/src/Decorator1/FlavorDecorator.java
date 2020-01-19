package Decorator1;

public abstract class FlavorDecorator extends BasicCake {
	
	protected BasicCake specialCake;
	
	public FlavorDecorator(BasicCake specialCake) {
		this.specialCake = specialCake;
	}
	public String getDescription() {
		return specialCake.getDescription();
	}
	

}
