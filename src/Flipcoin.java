import java.util.Scanner;

public class Flipcoin{
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter number");
		int totalFlip=scan.nextInt();
		int headFlip=0;
		int tailFlip=0;
		if(totalFlip>0) {
			
			for(int i=1;i<=totalFlip;i++) {
			double flip=Math.floor(Math.random()*10)%2;
			if(flip<0.5) {
				headFlip++;
			}else {
				tailFlip++;
			}
		}
		}
		double headPercent=(headFlip*100)/totalFlip;
		double tailPercent=(tailFlip*100)/totalFlip;
		System.out.println("Head flip Percentage is " +headPercent);
		System.out.println("Tail flip Percentage is " +tailPercent);
		
}
}