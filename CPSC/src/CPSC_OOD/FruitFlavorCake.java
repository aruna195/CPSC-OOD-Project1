package CPSC_OOD;

public class FruitFlavorCake extends FlavorDecorator {
	
	 public FruitFlavorCake(Cake specialCake) {
		this.specialCake = specialCake;
	}

	public double getCost() {		
			return this.specialCake.getCost() + 10.00;
	} 
}
	
	
	
	
	
		
	 
		

