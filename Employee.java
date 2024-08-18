package SalaryManagement;

public class Employee {
	
	String name;
	int employeeId;
	double basicSalary;
	
	public Employee(String name,int empId,double basicSalary){
		this.name = name;
		this.employeeId = empId;
		this.basicSalary = basicSalary;
	}
	
	public double calculateSalary(){
		return 0.0;
	}
	
	public void dispalyDetails(){
		System.out.println("Employee :"+this.name);
		System.out.println("Employee ID :"+this.employeeId);
		System.out.println("basic Salary :"+this.basicSalary);
		System.out.println("Total Salary :"+this.calculateSalary());
		
		
	}

}
