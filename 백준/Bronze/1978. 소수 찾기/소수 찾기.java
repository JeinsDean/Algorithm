import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int cnt = 0;
		while(st.hasMoreTokens()) {
			boolean isPrime = true;
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 1) {
				continue;
			}
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}