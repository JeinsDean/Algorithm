import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int rng = 2;
 
		if (N == 1) {
			System.out.print(1);
		}
 
		else {
			while (rng <= N) {
				rng = rng + (6 * cnt);
				cnt++;
			}
			System.out.print(cnt);
		}
	}
}