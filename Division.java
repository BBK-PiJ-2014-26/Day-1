import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		int result = 0;
		int count = 0;
		if (num2 == 0) {
			System.out.println("Cannot divide by zero.");
		} else {
			if (num1 < 0 && num2 < 0) {
				int temp1 = num1 * -1;
				int temp2 = num2 * -1;
				result = temp1;
				for(count = 0; result >= temp2; count++) {
					result = result - temp2;
				}
			} else if (num1 < 0) {
				int temp1 = num1 * -1;
				result = temp1;
				for(count = 0; result >= num2; count++) {
					result = result - num2;
				}
				count = count * -1;
				result = result * -1;
			} else if (num2 < 0) {
				int temp2 = num2 * -1;
				result = num1;
				for(count = 0; result >= temp2; count++) {
					result = result - temp2;
				}
				count = count * -1;
				result = result * -1;
			} else {
				result = num1;
				for(count = 0; result >= num2; count++) {
					result = result - num2;
				}
			}
			System.out.println(num1 + " divided by " + num2 + " equals " + count + " remainder " + result + ".");
		}
	}
}