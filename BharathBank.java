class BharathBank{
	int accountBalance;
	final String typeOfAccount;
	final int interestRateForCurrent = 3;
	final int interestRateForSavings = 0;
	final double calculateInterestForThePeriod = 0.24;
	
	BharathBank(int balance,String accountType){
		this.accountBalance = balance;
		this.typeOfAccount = accountType;
	}
	
	public String depositeMoney(int depositedMoney){
		this.accountBalance += depositedMoney;
		return "Gopal deposited "+depositedMoney+" money";
	}
	
	public String withdrawMoney(int amountToWithdraw){
		if(this.accountBalance < amountToWithdraw){
			return "No sufficient amount to withdraw";
		}
		this.accountBalance -= amountToWithdraw;
		return "Amritha withdraws "+amountToWithdraw+" money";
	}
	
	public double calculateInterest(){
		int interest ;
		if(this.typeOfAccount == "current"){
			interest = interestRateForCurrent;
		}
		else{
			interest = interestRateForSavings;
		}
		double balanceWithInterest =  this.accountBalance*interest;
		return (double) balanceWithInterest*calculateInterestForThePeriod/100;
	}
}
