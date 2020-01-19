package CPSC;

public class MarbleFlavorCake implements Cake {
	
	public MarbleFlavorCake() {
		super();
	}
	
	@Override
	public String getDescription() {
		
		return " Cake.Flavor: Maple ";
	}

	@Override
	public double getCost() {
		
		return	25.00;	
	}
}
