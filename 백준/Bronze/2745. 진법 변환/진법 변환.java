import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        String N = st.nextToken();                // 수
        int B = Integer.parseInt(st.nextToken()); // 진법
        br.close();

        System.out.println(Integer.parseInt(N, B));
    }
}   