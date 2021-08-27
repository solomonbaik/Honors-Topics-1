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
}
