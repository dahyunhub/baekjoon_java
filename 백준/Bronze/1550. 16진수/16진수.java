import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String str = sc.nextLine();
			int result = Integer.parseInt(str, 16);

			System.out.println(result);
			sc.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
