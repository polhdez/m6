package m6;
public class Mid extends Employee {
	
	public Mid() {
			this.salary_percent -= 10;
			this.salary_range = new int[] {1800, 2500};
			this.tax_percent = 15;
	}
}
