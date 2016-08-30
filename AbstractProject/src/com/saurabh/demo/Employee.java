package com.saurabh.demo;

public class Employee {
	private int id;
	private String name;
	private String Designation;
	private String Department;
	private int Basic;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getBasic() {
		return Basic;
	}
	public void setBasic(int basic) {
		Basic = basic;
	}
	
	public Employee(){
		
	}
	public void display(){
		System.out.println("\nDetails of employee is:\n");
		System.out.println(this.getId());
		System.out.println(this.getName());
		System.out.println(this.getDesignation());
		System.out.println(this.getDepartment());
		System.out.println(this.getBasic());
	}
}
