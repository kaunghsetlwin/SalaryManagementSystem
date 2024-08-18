package SalaryManagement;

public class ContractEmployee extends Employee{
	int contractDuration;
    double contractAmount;
    
    public ContractEmployee(int contractDuration,double contractAmount,String name,int empId,double basicSalary){
    	super(name,empId,basicSalary);
    	this.contractDuration = contractDuration;
    	this.contractAmount = contractAmount;
    }
    @Override
    public double calculateSalary(){
    double total = contractAmount / contractDuration;
    return total;
    }

}
