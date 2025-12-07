import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            // 기본 값(N=0일 때)
            int zero = 1;
            int one = 0;
            int zeroPlusOne = 1;
            
            for (int j= 0; j < n; j++) {
                zero = one;
                one = zeroPlusOne;
                zeroPlusOne = zero + one;
            } System.out.println(zero + " " + one);
        }
        br.close();
    }
}