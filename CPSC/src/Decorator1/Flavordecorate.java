package Decorator1;

public abstract class Flavordecorate extends ChocolateFlavor {

protected ChocolateFlavor cCake;
	
	public Flavordecorate(ChocolateFlavor cCake) {
		this.cCake = cCake;
	}
	public String getDescription() {
		return cCake.getDescription();
	}
}


