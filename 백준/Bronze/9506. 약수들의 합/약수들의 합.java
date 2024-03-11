import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            if(n == -1) break;

            int sum = 0;
            sb.append(n).append(" = ");
            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }
            if(n == sum) {
                sb.delete(sb.length() - 3, sb.length());
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        br.close();
        
    }
}   