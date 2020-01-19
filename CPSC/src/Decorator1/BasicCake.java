package Decorator1;

public class BasicCake implements Cake{
	
	
	@Override
	public String getDescription() {
		
		return " Cake.Flavor: ";
	}

	@Override
	public double getCost() {
		
		return	20.00;	
	}
	
}



	
	
	