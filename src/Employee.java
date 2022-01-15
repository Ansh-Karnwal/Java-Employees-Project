public class Employee {
	String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeekly_hours() {
		return weekly_hours;
	}

	public void setWeekly_hours(Double weekly_hours) {
		this.weekly_hours = weekly_hours;
	}

	public Double getPay_rate() {
		return pay_rate;
	}

	public void setPay_rate(Double pay_rate) {
		this.pay_rate = pay_rate;
	}

	public Double getIncome_tax() {
		return income_tax;
	}

	public void setIncome_tax(Double income_tax) {
		this.income_tax = income_tax;
	}


	String name;
	Double weekly_hours;
	Double pay_rate;
	Double income_tax;
	public Employee(String id, String name, Double weekly_hours, Double pay_rate, Double income_tax) {
		this.id = id;
		this.name = name;
		this.weekly_hours = weekly_hours;
		this.pay_rate = pay_rate;
		this.income_tax = income_tax;
		
	}
		
	EmployeeIncome emp_calc() {
		double grossIncome = getWeekly_hours() * getPay_rate();
		if(getWeekly_hours() > 40) {
			double overtimePay = (getPay_rate() * (getWeekly_hours()-40))*1.5;
			double overtimeHours = getWeekly_hours()-40;
			grossIncome = (getWeekly_hours()-overtimeHours) * getPay_rate() +  overtimePay;
		}
		double taxWitheld = getIncome_tax() * grossIncome;
		double netIncome = grossIncome - taxWitheld;
		return new EmployeeIncome(grossIncome, netIncome);
		
	}
	
	public void empPrint() {
		double grossIncome = getWeekly_hours() * getPay_rate();
		if(getWeekly_hours() > 40) {
			double overtimePay = (getPay_rate() * (getWeekly_hours()-40))*1.5;
			double overtimeHours = getWeekly_hours()-40;
			grossIncome = (getWeekly_hours()-overtimeHours) * getPay_rate() +  overtimePay;
		}
		System.out.printf("%s's Gross Income is $%.2f\n", getName(), grossIncome);
		System.out.printf("Taxes Withheld @ %.2f%% is $%.2f\n", getIncome_tax() * 100, getIncome_tax() * grossIncome);
		System.out.printf("%s's Net Income is $%.2f\n", getName(), grossIncome - getIncome_tax() * grossIncome);
	}
		
		
		
		
		
	

}
