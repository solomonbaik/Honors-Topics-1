
public class ATMTester {
	public static void main (String [] args) throws Exception
	{
		ATM test = new ATM ();
		test.deposit("Winfrey", 25159684372.43);
		test.deposit("Bezos", 193495330293.43);
		test.deposit("Bezos", 20394353.35);
		test.withdraw("Bezos", 3593293.66);
		test.deposit("MrTheiss",64033.55);
		test.withdraw("MrTheiss", 443964.46);
		
		test.checkBalance("Bezos");
		test.checkBalance("Winfrey");
		test.checkBalance("YoMama");
		test.checkBalance("MrTheiss");
	}
}
