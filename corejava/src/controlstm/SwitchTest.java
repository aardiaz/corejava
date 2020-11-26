package controlstm;

public class SwitchTest {
	/*
	 *   switch(expression/var){
	 *   
	 *       case 1 :
	 *          //statements
	 *          break;
	 *       
	 *       case 2 :
	 *          //statements
	 *         break;
	 *         
	 *        ..................
	 *        ............
	 *        ..................
	 *        default :
	 *          //statements     
	 *   
	 *   
	 *   }
	 */
	
	public static void main(String[] args) {
		
		int day = 30;
		
		switch(day) {
		
		case 1 :
			System.out.println("sunday");
			break;
			
		case 2 :
			System.out.println("Monday");
			break;
			
		case 3 :
			System.out.println("Tuesday");
			break;
			
		case 4 :
			System.out.println("Wednesday");
			break;
			
		case 5 :
			System.out.println("Thursday");
			break;
			
		case 6 :
			System.out.println("Friday");
			break;
			
		case 7 :
			System.out.println("Saturday");
			break;
			
			default :
				System.out.println("invalid input");
		
		
		
		
		}
		
		
	}

}
