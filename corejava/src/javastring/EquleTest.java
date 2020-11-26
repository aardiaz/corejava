package javastring;

public class EquleTest {
	
	public static void main(String[] args) {
		
		
		String s = "java";
		String t = "php";
		
		System.out.println(s.equals(t));
		System.out.println(s.equals("Java"));
		System.out.println(s.equalsIgnoreCase("Java"));
	}
}
