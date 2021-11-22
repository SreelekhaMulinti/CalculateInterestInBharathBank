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

public class CalculateInterestInBharathBank{
	public static void main(String[] args){
		BharathBank gopalsAccount = new BharathBank(50000,"current");
		BharathBank amrithasAccount = new BharathBank(100000,"savings");
		//Gopal deposited money
		System.out.println(gopalsAccount.depositeMoney(10000));
		
		//Amritha withdrwas money
		System.out.println(amrithasAccount.withdrawMoney(45000));
		
		//Calculate Interests
		System.out.println("Gopals interest is : "+gopalsAccount.calculateInterest());
		System.out.println("Amrithas interest is : "+amrithasAccount.calculateInterest());
	}
}
