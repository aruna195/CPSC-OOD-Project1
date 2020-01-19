package Decorator1;
public class ChocolateFlavorCake extends FlavorDecorator {
	 public ChocolateFlavorCake(BasicCake specialCake) {
		super(specialCake);		
	}

	public double getCost() {		
			return super.getCost() + 10.00;
	} 
}
	
	
	
	
	
		
	 
		

