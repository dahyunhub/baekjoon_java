import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int minute = A * 60 + B;
		
		int endMinute = minute + C;
		int endHour = 0;
		
		if (endMinute / 60 > 0) {
			endHour = (endMinute / 60) % 24;
			endMinute = endMinute % 60; 
		}
		System.out.println(endHour + " " + endMinute);
	}
}
