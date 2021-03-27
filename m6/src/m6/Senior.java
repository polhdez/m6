package m6;
public class Senior extends Employee {
	
	public Senior() {
		this.salary_percent -= 5;
		this.salary_range = new int[] {2700, 4000};
		this.tax_percent = 24;
	}
}
