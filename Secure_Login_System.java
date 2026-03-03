/*You are developing a secure login system for a company’s internal server as part of a cyber-security implementation.
 *  The system must verify whether a user is allowed to access the system based on multiple security conditions. 
 *  The program should accept a username, password, number of login attempts, and account lock status (true/false) from the user.
 *   Access should only be granted if the account is not locked, the number of login attempts is less than or equal to three, and both the username and password match the correct credentials stored in the system. 
 *   If the account is locked, access must be denied immediately. 
 *   If the number of login attempts exceeds three, the system should deny access and indicate that the account should be locked.
 *    If either the username or password is incorrect, access should be denied. 
 *    Use appropriate conditional statements (if, else if, else) and Boolean expressions involving relational operators (==, !=, <, >, <=, >=) and logical operators (&&, ||, !) to implement the security validation logic.
 
 */
import java.util.Scanner;//importing scanner class for user input.
public class Secure_Login_System {
	public static void main(String[] args) {
		String genuine_username = "Admin";// String for matching the correct user-name.
		String genuine_Password = "Cyber123";// String for matching the correct password
		String username;// String for taking user-name from the user.
		String password;// String for taking password from the user.
		int attempt;// int variable for creating a loop of three times.
		boolean login = false;// variable for login check.
		/*
		 * The following for loop executes 3 times.
		 * it takes user input: user-name & password
		 * it matches f the genuine_username & genuine_password matches with users
		 * provided use-rname & password
		 * if it matches it grants the access and exits the loop.
		 * if it dosen't it executes two more times.
		 * because the username and password are taking user input from scanner class
		 * and is located in the loop they execute twice more too.
		 * if the user still fails to provide accurate cridentials it exits the loop.
		 */

		for (attempt = 1; attempt <= 3; attempt++) {
			Scanner keyboardinput = new Scanner(System.in);
			System.out.println("whats the user name ?");
			username = keyboardinput.next();
			System.out.println("Whats the password ?");
			password = keyboardinput.next();
			if (genuine_username.equals(username) && genuine_Password.equals(password)) {
				login = true;
				System.out.println("you have been granted access");
				break;
			} else {
				System.out.println("invalid cridentilas");
			}
		}

		// if the user failed to login three times it automactically makes !login and it
		// serves the message "access denied""
		if (!login) {
			System.out.println("Access denied");
		}

	}
}