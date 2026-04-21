import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int i = sc.nextInt();
		
		if (S.length() <= 1000) {
			if (i >= 1 && i <= S.length()) {
						System.out.println(S.charAt(i-1));
					
			}
		}
	}
}