package m6;
public class Junior extends Employee {
	
	public Junior() {
		this.salary_percent -= 15;
		this.salary_range = new int[] {900, 1600};
		this.tax_percent = 2;
	}
}
