package arithmeticcalculator;
import java.util.Scanner;
public class Calciarithmetic {

	public static void main(String[] args) {


		    char operator;
		    Double numbA, numbB, result;

		    Scanner input = new Scanner(System.in);

		    System.out.println("Enter a number");
		    numbA = input.nextDouble();

		    System.out.println("Enter another number");
		    numbB = input.nextDouble();
		    // ask users to enter operator
		    System.out.println("enter an operator: +, -, *, or /");
		    operator = input.next().charAt(0);

		    switch (operator) {

		      case '+':
		        result = numbA + numbB;
		        System.out.println(numbA + " + " + numbB + " = " + result);
		        break;

		      case '-':
		        result = numbA - numbB;
		        System.out.println(numbA + " - " + numbB + " = " + result);
		        break;

		      case '*':
		        result = numbA * numbB;
		        System.out.println(numbA + " * " + numbB + " = " + result);
		        break;

		      case '/':
		        result = numbA / numbB;
		        System.out.println(numbA + " / " + numbB + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		    input.close();
		  
		

	}

}
