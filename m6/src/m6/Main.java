package m6;
public class Main {
	public static void main(String[] args) throws Exception {
		
		Boss myBoss = new Boss();
		myBoss.setSalary(8500);
		myBoss.giveBonus();
		System.out.println("Boss");
		System.out.println("Net Salary: " + myBoss.getSalaryNet());
		System.out.println("Gross Salary " + myBoss.getSalaryGross());
		System.out.println("Net Salary Year: " + myBoss.getSalaryNetYear());
		System.out.println("Gross Salary Year: " + myBoss.getSalaryGrossYear());
		System.out.println("Bonus" + myBoss.bonus);
		System.out.println();
		
		Manager myManager = new Manager();
		myManager.setSalary(3500);
		myManager.giveBonus();
		System.out.println("Manager");
		System.out.println("Net Salary: " + myManager.getSalaryNet());
		System.out.println("Gross Salary " + myManager.getSalaryGross());
		System.out.println("Net Salary Year: " + myManager.getSalaryNetYear());
		System.out.println("Gross Salary Year: " + myManager.getSalaryGrossYear());
		System.out.println("Bonus" + myManager.bonus);
		System.out.println();
		
		Senior mySenior = new Senior();
		mySenior.setSalary(3000);
		myManager.giveBonus();
		System.out.println("Senior");
		System.out.println("Net Salary: " + mySenior.getSalaryNet());
		System.out.println("Gross Salary " + mySenior.getSalaryGross());
		System.out.println("Net Salary Year: " + mySenior.getSalaryNetYear());
		System.out.println("Gross Salary Year: " + mySenior.getSalaryGrossYear());
		System.out.println(mySenior.bonus);
		System.out.println();
		
		Mid myMid = new Mid();
		myMid.setSalary(2000);
		myManager.giveBonus();
		System.out.println("Mid");
		System.out.println("Net Salary: " + myMid.getSalaryNet());
		System.out.println("Gross Salary " + myMid.getSalaryGross());
		System.out.println("Net Salary Year: " + myMid.getSalaryNetYear());
		System.out.println("Gross Salary Year: " + myMid.getSalaryGrossYear());
		System.out.println("Bonus" + myMid.bonus);
		System.out.println();
		
		Junior myJunior = new Junior();
		myJunior.setSalary(1000);
		myManager.giveBonus();
		System.out.println("Junior");
		System.out.println("Net Salary: " + myJunior.getSalaryNet());
		System.out.println("Gross Salary " + myJunior.getSalaryGross());
		System.out.println("Net Salary Year: " + myJunior.getSalaryNetYear());
		System.out.println("Gross Salary Year: " + myJunior.getSalaryGrossYear());
		System.out.println("Bonus" + myJunior.bonus);
		System.out.println();
		
		Volunteer myVolunteer = new Volunteer();
		myVolunteer.giveHelpMoney(300);
		System.out.println("Volunteer");
		System.out.println("Has help: " + myVolunteer.getHasHelp());
		System.out.println("Help money: " + myVolunteer.getHelpMoney());
	}
}
