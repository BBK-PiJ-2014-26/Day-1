import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		int result = 0;
		int count = 0;
		if (num2 > 0) {
			for(count = 1; count <= num2; count++) {
				result = result + num1;
			}
		} else if (num2 < 0) {
			for(count = -1; count >= num2; count--) {
				result = result - num1;
			}
		}		
		System.out.println(num1 + " multiplied by " + num2 + " equals " + result + ".");
	}
}