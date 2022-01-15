
public class EmployeeIncome {
	double grossIncome;
	public double getGrossIncome() {
		return grossIncome;
	}
	public void setGrossIncome(double grossIncome) {
		this.grossIncome = grossIncome;
	}
	public double getNetIncome() {
		return netIncome;
	}
	public void setNetIncome(double netIncome) {
		this.netIncome = netIncome;
	}
	double netIncome;
	public EmployeeIncome(double grossIncome, double netIncome) {
		this.grossIncome = grossIncome;
		this.netIncome = netIncome;
	}
}
