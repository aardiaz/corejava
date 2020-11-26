package array;

import java.util.Scanner;

public class Array2 {
	
	public static void main(String[] args) {
		
		String[]  subjects = {"Eng","Maths","Compt","Sci","Eph","Nep","Social"};
		int  marks[] = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<7;i++) {
			
			System.out.println("Enter marks for : "+subjects[i]);
			marks[i] = sc.nextInt();
		}
		
		
		//read marks from array
		int total =0;
		
		int maxv = marks[0];
		int minv = marks[0];
		
		for(int x : marks) {
			
			total = total + x;
			
			if(maxv < x) {
				maxv =x;
			}
			
			if(minv > x){
				minv = x;
			}
			
		}
		
		System.out.println("Total marks = "+total);
		System.out.println("Average marks = "+total/7);
		System.out.println("Max marks= "+ maxv);
		System.out.println("Min marks = "+minv);
		
		
		
	}

}
