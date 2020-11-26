package abstraction;

public class LaxmiBank extends CentralBank{

	@Override
	protected String getName() {

		return "Laxmi Bank";
	}

	@Override
	protected int getRate() {
		
		return 10;
	}

}
