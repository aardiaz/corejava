package javastring;

public class StringImmutable {
	/*
	 * immutable => unchangeable or uneditable 
	 *           => can't change original value of object at runtime
	 */
	
	public static void main(String[] args) {
		
		
		String s = "Good morning";
		s.concat(" Student");
		System.out.println(s);//output=> Good morning 
								// String are immutable
		
		
		//=============== mutable class: StringBuffer, StringBuilder=======
		StringBuilder  sb = new StringBuilder("Good morning");
		  sb.append(" Student");
		  System.out.println(sb);
		
	} 

}
