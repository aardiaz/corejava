package controlstm;

import java.util.Scanner;

public class NestedIfTest {
	/*
	 *   if(condition_1){
	 *   
	 *        if(condition_2){
	 *        
	 *           if(condition_3){
	 *             ..............
	 *             ..............
	 *           }else{
	 *           
	 *           }
	 *        
	 *        }else{
	 *        
	 *        }
	 *   
	 *   }else{
	 *   
	 *   }
	 */
	
	public static void main(String[] args) {
		
		String citizen = "nepali";
		int age = 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("you citizenship ?");
		citizen = sc.next();
		
		System.out.println("Your age ?");
		age = sc.nextInt();
		
		if(citizen.equals("nepali")) {
			
			if(age >= 18) {
				
				  System.out.println("You can vote !!");
				
			}else {
				System.out.println("you are under age !!");
			}
			
		}else {
			System.out.println("You are not nepali !!");
		}
		
		
	}

}




