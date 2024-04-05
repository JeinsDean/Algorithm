import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i <= N; i++) {
            String str = String.valueOf(i);

            int val = i;
            for(char c : str.toCharArray()) {
                int tmp = Character.getNumericValue(c);
                val = val + tmp;
            }
            if(val == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}