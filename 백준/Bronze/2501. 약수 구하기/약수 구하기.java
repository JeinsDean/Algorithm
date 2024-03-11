import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 6 3
        for(int i = 1; i <= n; i++) {
            m = m - (n % i == 0 ? 1 : 0);
            if(m == 0) {
                System.out.println(i);
                break;
            }
        }
        br.close();

        if(m != 0)
            System.out.println(0);

        
    }
}   