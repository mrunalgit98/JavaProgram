import java.util.Scanner;

public class division{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dividend : ");
		int dividend = sc.nextInt();
		System.out.println("dividor : ");
		int divisor = sc.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}