import java.util.Scanner;

public class findLargestNo{
	
	public static void main(String[] args) {
		int x,y,z, largest , temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		x= sc.nextInt();
		System.out.println("enter second number");
		y =sc.nextInt();
		System.out.println("enter third number");
		z = sc.nextInt();
	    System.out.println("enter third number");
	    temp = x > y ? x:y;
	    largest = z > temp ? z:temp;
	    System.out.println("the largest number is " + largest);
	}
	
}