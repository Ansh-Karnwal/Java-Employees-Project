import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Main emps = new Main();
		int emp_num = emps.emp_num_validation();
		double total_gross_income = 0;
		double total_net_income = 0;
		for(int i = 1; i <= emp_num; i++) {
			Scanner scan = new Scanner(System.in);
			Employee emp = new Employee(null, null, null, null, null);
			System.out.print("Enter Employee’s ID (i.e. AF101): ");
			emp.id = scan.nextLine();
			System.out.print("Enter Employee’s Name: ");
			emp.name = scan.nextLine();
			System.out.printf("Enter %s's Weekly Hours (Maximum of 60 Hours per Week): ", emp.name);
			emp.weekly_hours = scan.nextDouble();
			System.out.printf("Enter %s's Hourly pay rate: ", emp.name);
			emp.pay_rate = scan.nextDouble();
			System.out.printf("Enter %s's Income tax rate (0 to 0.40): ", emp.name);
			emp.income_tax = scan.nextDouble();
			total_gross_income += emp.emp_calc().grossIncome;
			total_net_income += emp.emp_calc().netIncome;
			emp.empPrint();
		} 
		System.out.printf("\nTotal Gross Income for %d employee(s) is $%.2f\n", emp_num, total_gross_income);
		System.out.printf("Total Net Income for %d employee(s) is $%.2f\n", emp_num, total_net_income);
		System.out.printf("Average Gross Income for the company is $%.2f\n", total_gross_income/emp_num);
		System.out.printf("Average Net Income for the company is $%.2f\n", total_net_income/emp_num);
	
	}
	public int emp_num_validation() {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many employees in this week’s payroll: ");
		int emp_num = scan.nextInt();
		while(emp_num<0) {
			System.out.println("Sorry, illegal input! Please input again.");
			System.out.print("How many employees in this week’s payroll: ");
				emp_num = scan.nextInt();
			scan.close();
			}
		if(emp_num==0) {
			System.out.println("NO PAYROLL? Great! Goodbye.");
			System.exit(emp_num);
		}
		return emp_num;
	}	

}
