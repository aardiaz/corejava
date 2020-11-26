package constructor;

public class User {

	String userName;
	String password;

	// 1. default constructor
	User() {
		userName = "root";
		password = "111";
	}

	// 2. parameterized constructor
	User(String userName, String password) {
		// this represents the current object

		// this("test");
		this.userName = userName;
		this.password = password;
		// this.print();
	}

	User(String userName) {
		this.userName = userName;
	}

	void print() {
		System.out.println("UserName = " + userName);
		System.out.println("Password  = " + password);
	}

	public static void main(String[] args) {

		// Object class is the parent or root class of java

		User u = new User("ram", "999");
		u.print();
	}

}
