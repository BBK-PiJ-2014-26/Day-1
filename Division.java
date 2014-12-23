import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		int result = num1;
		int count = 0;
		for(count = 0; result >= num2; count++) {
			result = result - num2;
		}
		System.out.println(num1 + " divided by " + num2 + " equals " + count + " remainder " + result + ".");
	}
}