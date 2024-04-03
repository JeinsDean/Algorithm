import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int a = 0, b = 0, c = 0;
        while(true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            
            if(a == 0 && b == 0 && c == 0) break;

            int max = Math.max(a, Math.max(b, c));
            if(((a + b + c) - max) <= max) {
                sb.append("Invalid");
                sb.append("\n");
                continue;
            }

            if(a == b && a == c) {
                sb.append("Equilateral");
            } else {
                if(a == b || a == c || b == c) {
                    sb.append("Isosceles");
                } else {
                    sb.append("Scalene");
                }
            }

            sb.append("\n");
        };
        br.close();

        System.out.println(sb);
    }
}