import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		sc = new Scanner(System.in);
		double num2 = sc.nextDouble();
		double result = num1 * num2;
		System.out.println(num1 + " multiplied by " + num2 + " equals " + result + ".");
	}
}