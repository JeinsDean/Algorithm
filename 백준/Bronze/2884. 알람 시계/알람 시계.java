import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		br.close();
		int h = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		if (h == 0 && m < 45) {
			h = 23;
			m = m + 60;
		} else if (m < 45) {
			h = h - 1;
			m = m + 60;
		}
		m = m - 45;

		System.out.println(h + " " + m);
	}
}