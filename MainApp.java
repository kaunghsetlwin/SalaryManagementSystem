package SalaryManagement;

public class MainApp  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FullTimeEmployee fte = new FullTimeEmployee("John Doe",101,50000.0,10000.0,10000.0);
		fte.calculateSalary();
		fte.dispalyDetails();
		System.out.println();
		
		PartTimeEmployee pte = new PartTimeEmployee(12,1000.0,"Jane Smith",102,0.0);
		pte.calculateSalary();
		pte.dispalyDetails();
		System.out.println();
		
		ContractEmployee cte = new ContractEmployee(12,60000.0,"Mark Johnson",103,0.0);
		cte.calculateSalary();
		cte.dispalyDetails();
	

	}

}
