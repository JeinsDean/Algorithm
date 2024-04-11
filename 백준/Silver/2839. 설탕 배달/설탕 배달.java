import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int num = 0;
        while (true) {
            if(N % 5 == 0) {
                num += N / 5;
                break;
            }

            N -= 3;
            num++;
            if(N < 0) {
                num = -1;
                break;
            }
        }
        System.out.println(num);
    }
}