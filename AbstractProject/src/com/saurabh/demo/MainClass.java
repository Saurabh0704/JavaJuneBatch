package com.saurabh.demo;

import java.util.Scanner;

public class MainClass {
 
	 public static void main(String args[]){
//			Road v =new Road(new Car());
//		 	v.roadCall();			
//			System.out.println("\n");
//			
//			v =new Road(new Truck());
//		 	v.roadCall();			
//			System.out.println("\n");
//			
//			v =new Road(new Cycle());
//		 	v.roadCall();			
//			System.out.println("\n");
		 
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("Enter Number Of Vehicles:\n");
		 	int No=sc.nextInt();
		 	
		 	Road r = new Road();
		 	r.input(No);
		    
			}	
 }

