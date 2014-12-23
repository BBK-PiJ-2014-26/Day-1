import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		boolean primeNumber = true;
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int divider = 2;
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			while (divider < num) {
				int result = num % divider;
				if (result == 0) {
					primeNumber = false;
					divider++;
				} else { 
					divider++;
				}
			}
			if (!primeNumber) {
				System.out.println(num + " is not a prime number. Goodbye.");
			} else {
				System.out.println(num + " is a prime number. Goodbye.");
			}
		} else {
			System.out.print("Invalid input. Goodbye.");
		}
	}
}