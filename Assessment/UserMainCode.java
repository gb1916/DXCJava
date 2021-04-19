public class UserMainCode {

	
	public static boolean isValid(String password)
	{

		
		
		if (password.length() < 8)
			{
			return false;
		}

		// to check space
		if (password.contains(" ")) {
			return false;
		}
		if (true) {
			int count = 0;

			
			for (int i = 0; i <= 9; i++) {

				
				String str1 = Integer.toString(i);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}
		if (!(password.contains("@") || password.contains("#")
			|| password.contains("!") || password.contains("~")
			|| password.contains("$") || password.contains("%")
			|| password.contains("^") || password.contains("&")
			|| password.contains("*") || password.contains("(")
			|| password.contains(")") || password.contains("-")
			|| password.contains("+") || password.contains("/")
			|| password.contains(":") || password.contains(".")
			|| password.contains(", ") || password.contains("<")
			|| password.contains(">") || password.contains("?")
			|| password.contains("|"))) {
			return false;
		}

		if (true) {
			int count = 0;

			
			for (int i = 65; i <= 90; i++) {

				
				char c = (char)i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		if (true) {
			int count = 0;

			
			for (int i = 90; i <= 122; i++) {

			
				char c = (char)i;
				String str1 = Character.toString(c);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		
		return true;
	}

	
	public static void main(String[] args)
	{

String password1 = "Babitha@123";

		if (isValid(password1)) {
			System.out.println(password1  +" " + "Valid Password");
		}
		else {
			System.out.println(password1  +" " + "Invalid Password!!!");
		}

		String password2 = "babitha123";
		if (isValid(password2)) {
			System.out.println(password2 + " " + "Valid Password");
		}
		else {
			System.out.println(password2 + " " +"Invalid Password!!!");
		}
String password3 = "Babitha123";

		if (isValid(password1)) {
			System.out.println(password3+" " + "Valid Password");
		}
		else {
			System.out.println(password3 +" " + "Invalid Password!!!");
		}
String password4 = "babitha@123";

		if (isValid(password1)) {
			System.out.println(password4 + " " + "Valid Password");
		}
		else {
			System.out.println(password4 + " " + "Invalid Password");
		}
		
}
}
 
