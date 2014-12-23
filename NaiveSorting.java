import java.util.Scanner;

public class NaiveSorting {

	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		int temp = 0;
		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.print("Enter third number: ");
		sc = new Scanner(System.in);
		int num3 = sc.nextInt();
		if (num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = num2;
			num2 = temp;
		} else if (num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.print(num3 + ", " + num2 + ", " + num1);				
	}
}