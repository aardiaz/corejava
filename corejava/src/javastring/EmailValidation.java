package javastring;

public class EmailValidation {
	
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(isValid(email));
	}
	
	
	static boolean isValid(String email) {
		
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }

}
