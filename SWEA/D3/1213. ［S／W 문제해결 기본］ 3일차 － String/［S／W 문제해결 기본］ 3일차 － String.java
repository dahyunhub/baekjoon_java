import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		
		for (int i = 1 ; i <= T; i++) {
			int testCase = sc.nextInt();
			String searchWord = sc.next();
			sc.nextLine();
			String str = sc.nextLine();
			
			int searchCount = 0;
			Matcher matcher = Pattern.compile(searchWord).matcher(str);
			
			while (matcher.find()) {
				searchCount++;
			}
			System.out.printf("#%d %d\n", testCase,searchCount);
		}
		
	}
}