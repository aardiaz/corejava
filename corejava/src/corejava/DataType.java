package corejava;

public class DataType {
	
	/*
	 *   1> primitive
	 *   	a> byte
	 *   	b> short
	 *   	c> int
	 *   	d> long
	 *   	e> float
	 *   	f> double
	 *   	g> char
	 *   	h> boolean
	 *   
	 *   2> non-primitive
	 *   	a> Array
	 *   	b> String
	 *   	c> Classes
	 *   	d> File
	 *   	e> Collection
	 */
	
	public static void main(String[] args) {
		
		long a = 5000000000l;
		float d = 3.6f;
		
		
		System.out.println("byte = "+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("short = "+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
		System.out.println("int = "+Integer.SIZE+" "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		System.out.println("long = "+Long.SIZE+" "+Long.MIN_VALUE+" "+Long.MAX_VALUE);
		System.out.println("float = "+Float.SIZE+" "+Float.MIN_VALUE+" "+Float.MAX_VALUE);
		System.out.println("double = "+Double.SIZE+" "+Double.MIN_VALUE+" "+Double.MAX_VALUE);
		System.out.println("char = "+Character.SIZE+" "+Character.MIN_VALUE+" "+Character.MAX_VALUE);
		
	}

}
