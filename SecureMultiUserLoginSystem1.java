/*You are developing a secure multi-user login system for a company’s internal server.
 *  The system must authenticate users based on their username and password, which are stored in two separate arrays.
 *   The first array contains the registered usernames, and the second array contains the corresponding passwords, where the username and password at the same index represent a valid user account.
 *    The program should allow a user to attempt login up to three times by entering their username and password through the keyboard.
 *     For each attempt, the system must compare the entered credentials with the stored values in the arrays using a loop. 
 *     If a matching username and password pair is found, the program should display “Access Granted” and terminate the login process immediately.
 *      If the credentials do not match any stored user, the program should display “Access Denied” along with the current attempt number and allow the user to try again until the maximum number of attempts is reached.
 *       If the user fails to provide correct credentials after three attempts, the system must display “Account blocked” and terminate the program.
 *        The solution must demonstrate the use of arrays, nested loops, conditional statements, Boolean variables, and the Scanner class for user input.
 */


import java.util.Scanner;//imported scanner class for user input.
public class SecureMultiUserLoginSystem1 {

	public static void main(String[] args) {
	String[] originalUsers = {"Abdullah","Sara","Abid","John","Michael"};//created an array for storing multiple original user names.
	String[] originalpasswords = {"123","456","789","321","654"};//created an second array for storing multiple original user passwords.
	String users;//created a string variable for taking user names.
	String passwords;//created another string for taking user passwords.
	int attempt;//created an int variable as a counter for how many times user can attempt providing credentials.
	
	boolean userFound= false;//a boolean variable that confirms if the user has provided right credentials.
	Scanner keyboardInput = new Scanner(System.in);//created a scanner object for taking user input.
	/*The outer for loop will take user inputs and give maximum attempts of three to provide credentials.
	 * pre-condition:The program takes a list of array's, strings and integers 
	 * post-condition:The loop begins and takes users provided credentials. it checks if the userFound is true then it breaks. else it gives attempts<4.
	 */
	for(attempt = 1; attempt < 4; attempt++) {
		System.out.println("Who is the user");
		users= keyboardInput.next();
		System.out.println("What is the password : ");
		passwords=keyboardInput.next();
		/*The inner for loop is created to match the users provided credentials with the originalUsers and originalPaswords
		 * pre-condition= the user has provided the credentials. i=0 in the inner loop to compare itself with the originalUsers.length(its length which is 4)
		 * an array starts with 0 not 1. example: originalUsers 1st value is Abdullah. So 0=Abdullah, 1=Sara, 2=Abid...
		 * The if condition checks if the users provided credentials matches with the originalUsers and originalPasswords.
		 * if it matches it prints access granted. stores user is found as userFound=true; and breaks.
		 */
	for(int i = 0; i < originalUsers.length; i++) {
		if (users.equals(originalUsers[i])&& passwords.equals(originalpasswords[i])){
		 System.out.println("Access Granted");
		 
		 userFound= true;
		 break;}}
	if(userFound) {break;}
	else {System.out.println("Access Denied. This is your attempt no.:" + attempt);}
		
	
		
	}
	//After doing three attempts if the user is not found (!userFound) which means userFound= false it prints account blocked.
	if(!userFound) {System.out.println("Account blocked");}
				

	}

}
