package sliver;

public class No4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];

		for (int i = 1; i < 10001; ++i) {
			int num = d(i);

			if (num < 10001) {
				check[num] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; ++i) {
			if (!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

	public static int d(int num) {
		int sum = num;

		for (; 0 < num; num /= 10) {
			sum += num % 10;
		}
		return sum;
	}

}