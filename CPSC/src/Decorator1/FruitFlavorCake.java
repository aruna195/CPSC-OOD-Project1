package Decorator1;

public class FruitFlavorCake extends ChocolateFlavor {
	
	public FruitFlavorCake(ChocolateFlavor cCake) {
		
		
	}
	
	public double getCost() {		
		return super.getCost()  + 25.00;
	}

}
