public class Main {
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

	public static int d(int number) {
		int sum = number;

		for (; 0 < number; number /= 10) {
			sum += number % 10;
		}
		return sum;
	}

}