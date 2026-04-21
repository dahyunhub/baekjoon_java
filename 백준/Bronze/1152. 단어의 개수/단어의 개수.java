
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		str = str.trim();

		if (str.isEmpty()) {
			System.out.println(0);
			return;
		} else {
			int numOfWords = 0;
			String words[] = str.split("\\s+");
			for (String w : words) {
				++numOfWords;
			}
			System.out.println(numOfWords);
		}
	}
}
