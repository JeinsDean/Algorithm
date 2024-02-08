import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = (max < arr[i]) ? arr[i] : max;
		}
		br.close();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				System.out.println(max);
				System.out.println(i + 1);
				break;
			}
		}
	}
}