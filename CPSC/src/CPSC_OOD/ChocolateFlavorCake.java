package CPSC_OOD;

public class ChocolateFlavorCake implements Cake {
	
	public ChocolateFlavorCake() {
		super();
	}
	
	@Override
	public String getDescription() {
		
		return " Cake.Flavor: Chocolate ";
	}

	@Override
	public double getCost() {
		
		return	30.00;	
	}
}
