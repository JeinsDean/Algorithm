import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            int p = Integer.parseInt(br.readLine());
            int q = p / 25;
            p = p - (q * 25);

            int d = p / 10;
            p = p - (d * 10);

            int n = p / 5;
            p = p - (n * 5); // 나머지 금액은 1원
            
            sb.append(q).append(" ").append(d).append(" ").append(n).append(" ").append(p).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}   