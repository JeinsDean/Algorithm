import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 0; 
        int idx = 666;
        // 666, 1666, 2666, 3666, 4666, 5666, 6666, 7666, 8666, 9666, 10666, 11666
        while (cnt < N) {
            if(String.valueOf(idx).contains("666")) {
                cnt++;
            }
            idx++;
        }
        idx = idx - 1;
        System.out.println(idx);
    }
}