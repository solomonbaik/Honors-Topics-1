import java.util.*;
public class ATM {
	
	private static HashMap<String, Double> map = new HashMap<String, Double>();
	
	public void deposit(String bankAccountID, double amount) {
		if(!map.containsKey(bankAccountID)) {
			map.put(bankAccountID, amount);
		}else {
			map.put(bankAccountID, map.get(bankAccountID) + amount);
		}
	}
	
	public void withdraw (String bankAccountID, double amount) throws Exception
	{
		if (!map.containsKey(bankAccountID))
		{
			throw new Exception ();
		}
		else
		{
			if (amount <= map.get(bankAccountID))
			{
				map.put(bankAccountID, map.get(bankAccountID)-amount);
			}
		}
	}
	
	public String checkBalance (String bankAccountID) throws Exception
	{
		if (!map.containsKey(bankAccountID))
		{
			throw new Exception ();
		}
		else
		{
			return ("" + map.get(bankAccountID));
		}
	}
}
