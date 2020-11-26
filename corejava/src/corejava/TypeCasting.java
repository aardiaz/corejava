package corejava;

public class TypeCasting {
	
	/*
	 *   syntax:
	 *     data_type  var = (data_type)value;
	 * 
	 * 
	 *   1> implicit: auto casting
	 *     byte -> short -> int -> long -> float -> double
	 *   
	 *   2> explicit : by force casting
	 *     double -> float -> long -> int -> short -> byte
	 */
	
	public static void main(String[] args) {
		//===auto casting=======
		byte x = 34;
		short s = x;
		double d = x;
		
		//=========explicit casting========
		double pi = 3.14;
		int pd =  (int)pi;
		
	}

}
