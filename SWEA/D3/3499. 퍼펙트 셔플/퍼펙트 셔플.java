
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class  Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);	
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			String[] strArr = new String[N];
			
			for (int i = 0 ; i < N ; i++) {
				strArr[i] = sc.next();
			}
			
			int mid = N / 2 + N % 2;
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0 ; i < N / 2; ++i) {
				sb.append(strArr[i]).append(" ");
				sb.append(strArr[i + mid]).append(" ");
			}
			
			if (N % 2 == 1) {
				sb.append(strArr[mid - 1]).append(" ");
			}
			
			System.out.printf("#%d %s\n", tc, sb);
		}
	}
}
