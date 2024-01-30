import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		for (int i = cnt; i > 0; i--) {
			System.out.print(" ".repeat(i - 1));

			for (int j = i; j <= cnt; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		br.close();
	}    
}