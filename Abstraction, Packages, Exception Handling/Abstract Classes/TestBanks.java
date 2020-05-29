package abstractClasses;

public class TestBanks {

	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		System.out.println("ICICI Savings Bank Interest Rate : "+i.getSavingsBankInterestRate());
		System.out.println("ICICI Fixed Deposit Interest RAte : "+i.getFixedDepositInterestRate());
		KotMBank k=new KotMBank();
		System.out.println("KotMBank Savings Bank Interest Rate : "+k.getSavingsBankInterestRate());
		System.out.println("KotMBank Fixed Deposit Interest RAte : "+k.getFixedDepositInterestRate());
		GeneralBank g=new ICICIBank();
		System.out.println("ICICI Savings Bank Interest Rate : "+g.getSavingsBankInterestRate());
		System.out.println("ICICI Fixed Deposit Interest RAte : "+g.getFixedDepositInterestRate());
		g=new KotMBank();
		System.out.println("KotMBank Savings Bank Interest Rate : "+g.getSavingsBankInterestRate());
		System.out.println("KotMBank Fixed Deposit Interest RAte : "+g.getFixedDepositInterestRate());
		
	}

}
