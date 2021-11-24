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
