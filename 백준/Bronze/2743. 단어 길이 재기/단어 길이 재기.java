import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int textCount = 0;
		
		if (str.length() <= 100) {
			for (int i = 1; i <= str.length(); ++i) {
				textCount = i;
			}
			System.out.println(textCount);
		}
	}
}
