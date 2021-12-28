public class Palindrome {
	
	public boolean palindromChecker(String... var) {
					
		for(String temp : var) {
			StringBuilder str = new StringBuilder().append(temp);
			
			str.reverse();
			String opposite = str.toString();

			if(!temp.equalsIgnoreCase(opposite)) {
				return false;	
			} 
			
		}
		return true;
	}
}