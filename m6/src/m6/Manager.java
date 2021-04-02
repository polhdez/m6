package m6;
public class Manager extends Person {
	
	public Manager() {
		this.salary_percent += 10;
		this.salary_range = new int[] {3000, 5000};
		this.tax_percent = 26;
	}
}
