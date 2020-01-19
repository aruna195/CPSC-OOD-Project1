package CPSC_OOD;

public class DecoratorPattern {

	public DecoratorPattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Cake cake = new FruitFlavorCake(new MarbleFlavorCake()) ;
		System.out.println("Marble cake cost : $" + cake.getCost());
		Cake cake1 = new FruitFlavorCake(new ChocolateFlavorCake()) ;
		System.out.println("Chocolate cake cost : $" + cake1.getCost());
		Cake cake2 = new FruitFlavorCake(new BasicCake()) ;
		System.out.println("BasicCake cost : $" + cake2.getCost());
		
		

	}

}
