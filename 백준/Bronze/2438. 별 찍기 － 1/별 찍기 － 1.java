import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		for (int i = 1; i <= cnt; i++) {
			System.out.println("*".repeat(i));
		}
		br.close();
	}
}