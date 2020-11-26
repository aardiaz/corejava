package array;

import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		
		int age[] = new int[5];
		
		//store value in array
//		age[1] = 20;
//		age[0] = 19;
//		age[2] = 22;
//		age[3] = 24;
//		age[4] = 20;
		
		Scanner  sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Enter your age?");
			age[i] = sc.nextInt();
		}
		
		//get or read value from array
		
	 for(int x : age) {	
		    System.out.println(x);
	 }
		
	}

}
