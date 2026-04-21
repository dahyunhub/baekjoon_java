
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pow = 0;
		
		for (int i = 0; i < 5; ++i) {
			int n = sc.nextInt();
			
			pow += (int)Math.pow(n, 2);
		}
		
		System.out.println(pow % 10); 
	}
}
