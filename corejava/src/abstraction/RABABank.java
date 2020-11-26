package abstraction;

public class RABABank extends CentralBank{

	@Override
	protected String getName() {
		 
		return "Raba Bank";
	}

	@Override
	protected int getRate() {
		return 20;
	}

}
