import java.util.*;
public class ATM {
	
	private static HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public void deposit(String bankAccountID, int amount) {
		if(!map.containsKey(bankAccountID)) {
			map.put(bankAccountID, amount);
		}else {
			map.put(bankAccountID, map.get(bankAccountID) + amount);
		}
	}
	
	public void withdraw (String bankAccountID, int amount) throws Exception
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
