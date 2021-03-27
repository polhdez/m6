package m6;
abstract class Person {
	protected int[] salary_range;
	protected double salary_gross;
	protected double salary_net;
	protected double salary_gross_year;
	protected double salary_net_year;
	protected int salary_percent = 0;
	protected int tax_percent = 0;
	protected int bonus_percent = 10;
	protected double bonus = 0;
	
	// Getters and setters	
	public void setSalary(double salary) throws Exception {
		try {
			this.checkSalary(salary);			
		}
		catch(SalaryOutOfRangeException e) {
			System.out.println(e);
			return;
		}
		salary = salary / 100 * (100 + salary_percent); 
		this.salary_gross = salary;
		this.salary_net = salary - (salary / 100) * this.tax_percent;
		this.salary_gross_year = this.salary_gross * 12;
		this.salary_net_year = this.salary_net * 12;
	}
	
	public double getSalaryGross() {
		return this.salary_gross;
	}
	
	public double getSalaryNet() {
		return this.salary_net;		
	}
	
	public double getSalaryGrossYear() {
		return this.salary_gross_year;
	}
	
	public double getSalaryNetYear() {
		return this.salary_net_year;		
	}
	
	public void giveBonus() {
		this.bonus = (this.salary_net_year / 100) * this.bonus_percent;
	}
		
	// Exception handling		
	private void checkSalary(double salary) throws Exception {
		if(salary < salary_range[0] || salary > salary_range[1]) {
			throw new SalaryOutOfRangeException("Salary has to be between: " + salary_range[0] + " and " + salary_range[1]);
		}
	}
}
