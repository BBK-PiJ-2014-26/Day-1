import java.util.Scanner;

public class YouSaidHigh {

	public static void main(String[] args) {

		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		boolean finished = false;
		boolean consecutive = true;
		if (num1 < 0) {
			System.out.println("Invalid input.");
			consecutive = false;
		}
		System.out.print("Enter a number or -1 to quit: ");
		sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		if (num2 == -1) {
			finished = true;
		} else if (num2 < -1) {
			System.out.println("Invalid input.");
			consecutive = false;
		} else if (num2 >= num1) {
			num1 = num1 + 1;
			if (num1 == num2) {
				num1 = num2 + 1;
			} else {
				consecutive = false;
			}
			while (!finished) {
				System.out.print("Enter a positive number or -1 to quit: ");
				sc = new Scanner(System.in);
				num2 = sc.nextInt();
				if (num2 == -1) {
					finished = true;
				} else if (num2 < -1) {
					System.out.println("Invalid input.");
					consecutive = false;
				} else if (num1 == num2) {
					num1 = num2 + 1;
				} else {
					consecutive = false;
				}
			}
		} else if (num2 < num1) { 
			num1 = num1 - 1;
			if (num1 == num2) {
				num1 = num2 - 1;
			} else {
				consecutive = false;
			}
			while (!finished) {
				System.out.print("Enter a positive number or -1 to quit: ");
				sc = new Scanner(System.in);
				num2 = sc.nextInt();
				if (num2 == -1) {
					finished = true;
				} else if (num2 < -1) {
					System.out.println("Invalid input.");
					consecutive = false;
				} else if (num1 == num2) {
					num1 = num2 - 1;
				} else {
					consecutive = false;
				}
			}
		}
		if (consecutive) {
			System.out.println("Yes.");
		} else {
			System.out.println("No.");
		}				
	}
}