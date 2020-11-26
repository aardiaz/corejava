package controlstm;

import java.util.Scanner;

public class IfElseTest {
	
	/*
	 *   if(condition){
	 *       //statements-true
	 *   }else{
	 *      //statements-false
	 *   }
	 */
	
	public static void main(String[] args) {
		
		int x = 30;
		int y = 70;
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter value of x ");
		x = sc.nextInt();
		
		System.out.println("Enter value of y ");
		y = sc.nextInt();
		
		sc.close();
		
		if(x>y) {
			System.out.println(x+" is greater than "+y);
		}else {
			System.out.println(y+" is greater than "+x);
		}
		
	}

}
