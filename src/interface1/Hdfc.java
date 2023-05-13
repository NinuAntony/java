package interface1;

public class Hdfc implements Rbi {

	@Override
	public void RecurringDeposit(int amount, int duration) {
		int totalamount=(amount*duration*r)/100;
		System.out.print("TOTAL AMOUNT AFTER 5 YEARS:"+" "+totalamount);

	}

	public static void main(String[] args) {
		Hdfc bank=new Hdfc();
		bank.RecurringDeposit(10000, 5);

	}

}
