package com.saurabh.demo;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String args[]){
		System.out.println("Enter Number Of Employee:\n");
		Scanner sc = new Scanner(System.in);
		int NoOfEmployee=sc.nextInt();
		Employee emp[]=new Employee[NoOfEmployee];
		
		for(int i=0;i<NoOfEmployee;i++){
			emp[i]=new Employee();
			System.out.println("ENTER EMPLOYEE DETAILS For Employee:"+(i+1));
			System.out.println("Enter the Employee Id:\n");
			emp[i].setId(sc.nextInt());
			System.out.println("Enter the Employee Name:\n");
			emp[i].setName(sc.next());
			System.out.println("Enter the Employee Designation:\n");
			emp[i].setDesignation(sc.next());
			System.out.println("Enter the Employee Department:\n");
			emp[i].setDepartment(sc.next());
			System.out.println("Enter the Employee Basic Pay:\n");
			emp[i].setBasic(sc.nextInt());
			emp[i].display();
		}
	}
}
