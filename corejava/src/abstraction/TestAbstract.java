package abstraction;

public class TestAbstract {
	
	public static void main(String[] args) {
		
		CentralBank  cb =  new LaxmiBank(); //CentralBank();
		
		System.out.println("Name = "+cb.getName());
		System.out.println("Rate = "+cb.getRate());
		
		//========interface test========
		
		UserService us = new UserServiceImpl();//UserService();
		us.add();
		us.delete();
		
		
	}

}
