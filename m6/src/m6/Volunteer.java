package m6;
public class Volunteer {
		
	final public double help_amount_limit = 300;
	private double help_money = 0;
	private boolean has_help = false;
	
	// Getters and setters
	public void giveHelpMoney(double help_amount) throws Exception {
		try {
			checkHelp(help_amount);
		}
		catch(TooMuchHelpException e) {
			System.out.println(e);
			return;
		}
		this.help_money = help_amount;
		this.has_help = true;
	}
	
	public double getHelpMoney() {
		return this.help_money;
	}
	
	public boolean getHasHelp() {
		return this.has_help;
	}
	
	// Exception handlers
	private void checkHelp(double help_amount) throws Exception {
		if (help_amount > this.help_amount_limit)  {
			throw new TooMuchHelpException("Too much help! " + help_amount + " is above " + this.help_amount_limit);
		}
	}
}
