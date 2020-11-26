package abstraction;

public abstract class CentralBank {
	
	protected abstract String getName();
	protected abstract  int getRate();
	
	public void moneyExRate() {
		
		System.out.println("$1 = 120");
		System.out.println("IC 100 = 160");
	}

}
