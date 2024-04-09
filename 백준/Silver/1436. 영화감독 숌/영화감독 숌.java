import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int idx = 666;
        // 666, 1666, 2666, 3666, 4666, 5666, 6666, 7666, 8666, 9666, 10666, 11666
        while (N > 0) {
            int temp = idx;
            while (temp >= 666) {
                if (temp % 1000 == 666) {
                    N--;
                    break;
                } else temp /= 10;
            }
            idx++;
        }
        System.out.println(--idx);
    }
}