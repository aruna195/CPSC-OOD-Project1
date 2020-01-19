package Decorator1;

public class MarbleFlavorCake extends FlavorDecorator {
	
	public MarbleFlavorCake(BasicCake specialCake) {
		super(specialCake);
	}
	
	public double getCost() {		
		return super.getCost() + 5.00;
    }
}
