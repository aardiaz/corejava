package objectasparam;

public class TestUser {

	public static void main(String[] args) {

		TestUser ts = new TestUser();
		
		 User x = ts.getUserData();
		 ts.printUserData(x);
	}

	// 1.object as a parameter
	void printUserData(User u) {

		System.out.println("Id  = " + u.getId());
		System.out.println("UN = " + u.getUserName());
		System.out.println("Psw = " + u.getPassword());
		System.out.println("Phone = " + u.getPassword());
		System.out.println("Address = " + u.getAddress());
	}

	// 2. object as return type
	User getUserData() {

		User u = new User();

		u.setId(222);
		u.setUserName("admin");
		u.setPassword("@345");
		u.setAddress("ktm");
		u.setPhone("934838438");

		return u;
	}

}
