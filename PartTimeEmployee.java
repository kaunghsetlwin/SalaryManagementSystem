package SalaryManagement;

public class PartTimeEmployee extends Employee{
	int hoursWorked;
	double hourlyRate;
	
	public  PartTimeEmployee(int hoursWorked,double hourlyRate,String name,int empId,double basicSalary){
		super(name,empId,basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	@Override 
	public double calculateSalary(){
		double total = hoursWorked * hourlyRate;
		return total;
	}
	

}
