import java.util.Scanner;

public class GoingUp {

	public static void main(String[] args) {
		System.out.print("Enter a positive number or -1 to quit: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		boolean finished = false;
		boolean increasing = true;
		if (num1 < -1) {
			System.out.println("Invalid input. Goodbye.");
		} else if (num1 == -1) {
			System.out.println("Goodbye.");
			finished = true;
		} else {
			num1 = num1 + 1;
			while (!finished) {
				System.out.print("Enter a positive number or -1 to quit: ");
				sc = new Scanner(System.in);
				int num2 = sc.nextInt();
				if (num2 == -1) {
					finished = true;
				} else if (num2 < -1) {
					System.out.println("Invalid input.");
					increasing = false;
				} else if (num1 == num2) {
					num1 = num2 + 1;
				} else {
					increasing = false;
				}
			}
			if (increasing) {
				System.out.println("Yes.");
			} else {
				System.out.println("No.");
			}				
		}
	}
}