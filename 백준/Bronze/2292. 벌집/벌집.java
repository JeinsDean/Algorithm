import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int cnt = 1;
        int sum = 2;

        if(N == 1) {
            System.out.println(1);
            
        } else {
            while (sum <= N) {
				sum = sum + (6 * cnt);
				cnt++;
			}
			System.out.print(cnt);
        }
    }
}   