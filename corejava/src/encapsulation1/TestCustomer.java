package encapsulation1;

public class TestCustomer {
	
	public static void main(String[] args) {
		
		Customer  c = new Customer();
		 c.setAddress("Kathmandu");
		 c.setId(888);
		 c.setName("Ramesh");
		 c.setPhone("934347834");
		 
		 System.out.println(c);
		
//		System.out.println("Id  = "+c.getId());
//		System.out.println("Name  = "+c.getName());
//		System.out.println("Address = "+c.getAddress());
//		System.out.println("Phone  = "+c.getPhone());
	} 
	

}
