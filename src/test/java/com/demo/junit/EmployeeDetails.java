package com.demo.junit;

public class EmployeeDetails {
	public void empId() {
		System.out.println("Employee ID is: 116");
	}
	public void empName() {
		System.out.println("Employee Name : M.MUTHUPANDI");
	}
	public static void main(String [] arg) {
		EmployeeDetails a=new EmployeeDetails();
		a.empId();
		a.empName();
	}
}
