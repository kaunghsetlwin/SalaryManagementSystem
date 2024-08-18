package SalaryManagement;

public class FullTimeEmployee extends Employee {
	double allowance;
	double bonus;
	
	public FullTimeEmployee(String name,int empId,double basicSalary,double allowance,double bonus){
		super(name,empId,basicSalary);
		this.allowance = allowance;
		this.bonus = bonus;
	}
	@Override
	public double calculateSalary(){
		double totalSalary = basicSalary + allowance + bonus;
		return totalSalary;
	}
	

}
