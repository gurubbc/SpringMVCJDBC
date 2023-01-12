package com.deloitte;

public class Employee {
	int employeeId;
	String employeeName;
	int departmentId;

	public Employee()
	{
		
	}
	
	public Employee(int eId, String eName, int dId )
	{
		employeeId=eId;
		employeeName=eName;
		departmentId=dId;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
		System.out.println("setting employee id");
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		System.out.println("Setting employee name");
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
		System.out.println("Setting department id");
	}
	
}
