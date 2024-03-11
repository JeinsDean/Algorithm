import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = -1, m = -1;
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            if(n == 0 && m == 0)
                break;

            if(n % m == 0) {
                sb.append("multiple").append("\n");
            } else if(m % n == 0) {
                sb.append("factor").append("\n");
            } else {
                sb.append("neither").append("\n");
            }

        }
        br.close();

        System.out.println(sb);
    }
}   