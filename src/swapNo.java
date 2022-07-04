import java.util.Scanner;

public class swapNo{
	
	public static void main(String[] args) {
		int x,y,z ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("before swaping " +x + " " +y);
		z=x;
		x=y;
		y=z;
		System.out.println("after swapping "+x + " " +y);
		
	}
	
}