package Decorator1;

public class DecoratorPattern {

	public static void main(String[] args) {
		
		Cake cake = new MarbleFlavorCake((new BasicCake()));
		System.out.println("Cake ordered with Marble Flavor: " + "$" + cake.getCost());
		
		//Cake cake1 = new ChocolateFlavorCake((new BasicCake()));		
		//System.out.println("Cake ordered with Chocolate Flavor: " + "$" + cake1.getCost());
		
		Cake cake2 = new FruitFlavorCake((new ChocolateFlavor()));
		System.out.println("Cake ordered with Fruit Flavor: " + "$" + cake2.getCost());
		
		//Cake cake3 = new FruitFlavorCake(new ChocolateFlavorCake((new BasicCake())));
		//System.out.println("Cake ordered with FruitChocolate Flavor: " + "$" + cake3.getCost());
		
		
		
		
		
		
	}

}
