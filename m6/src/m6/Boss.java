package m6;
public class Boss extends Person {
	
	public Boss() {
		this.salary_percent += 50;
		this.salary_range = new int[] {8000, Integer.MAX_VALUE};
		this.tax_percent = 32;
	}
}
