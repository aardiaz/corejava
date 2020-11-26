package corejava;

public class WrapperClassTest {
	
	/*
	 *    primitive_type 				wrapper_class
	 * ====================			=====================
	 *  	byte 						    Byte
	 *  	short							Short 
	 *  	int								Integer
	 *  	long							Long
	 *  	float							Float
	 *  	double							Double
	 *  	char							Character
	 *  	boolean							Boolean
	 */
	
	public static void main(String[] args) {
		//int x = 500;
	    Integer a = 500;
	     
	    System.out.println(Integer.toBinaryString(a));
	    System.out.println(Integer.toHexString(a));
	    System.out.println(Integer.toOctalString(a));
	    System.out.println(Integer.toString(a));
	    
	    //======Auto-boxing: primitive type change into object type ===============
	    int d = 300;
	    Integer f = d;
	    
	    //========= Auto-unboxing : object type -> primitive type ==============
	    
	    Float h = 3.67f;
	    float hf = h;
	}
}
