package Decorator1;

public class ChocolateFlavor implements Cake {

	public ChocolateFlavor() {
		
	}

	@Override
	public String getDescription() {
		
		return "Cake Flavor";
	}

	@Override
	public double getCost() {
		
		return 25.00;
	}

}
