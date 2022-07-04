import java.util.Scanner;

public class HarmonicNumber{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		double result =0.0;
		if(num>0) {
			System.out.println("the harmonic series is");
			for(int i=1;i<num;i++) {
				result=(double)1/i;
				System.out.println(result + ", ");
			}
		}
		
	}
	
}