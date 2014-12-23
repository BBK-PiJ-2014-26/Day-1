import java.util.Scanner;

public class Maximising {

	public static void main(String[] args) {
		System.out.print("Enter a positive number or -1 to quit: ");
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		boolean finished = false;
		if (max < -1) {
			System.out.println("Invalid input. Goodbye.");
		} else if (max == -1) {
			System.out.println("Goodbye.");
			max = 0;
			finished = true;
		} else {
			while (!finished) {
				System.out.print("Enter a positive number or -1 to quit: ");
				sc = new Scanner(System.in);
				int temp = sc.nextInt();
				if (temp == -1) {
					finished = true;
				} else if (temp < -1) {
					System.out.println("Invalid input. Try again.");
				} else if (temp > max) {
					max = temp;
				}
			}
			System.out.println("The maximum number is " + max + ".");				
		}
	}
}