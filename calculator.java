
 package calculator;
 import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		
		double x;
		double y;
		char operator;
		Scanner calculation = new Scanner(System.in);
		System.out.println ("Whats the 1st number ?");
		x=calculation.nextDouble();
		System.out.println("Whats the second number ?");
		y=calculation.nextDouble();
		System.out.println("What do you ant to do ?"+"\n + - * /");
		operator=calculation.next().charAt(0);
		switch(operator) {
		    case '+':
		        System.out.println("result " + (x + y));
		        break;
		    case '-':
		        System.out.println("result " + (x - y));
		        break;
		    case '/':
		        if (x != 0) {
		            System.out.println("result" + x / y);
		        } else {
		            System.out.println("cannot divide with 0");
		        }
		        break;
		    case '*':
		        System.out.println("result" + (x * y));
		        break;
		    default:
		        System.out.println("Invalid input");


		        calculation.close();
		}}}