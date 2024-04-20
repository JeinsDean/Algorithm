import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        br.close();

        if (A > B) { 
            bw.write(A * B / findLCM(A, B) + "\n");
        } else if (A < B) { 
            bw.write(A * B / findLCM(B, A) + "\n");
        } else { 
            bw.write(A + "\n"); 
        }

        bw.flush();
        bw.close();
    }

    // 최소 공배수 찾는 메서드
    static long findLCM(long A, long B) {
        while (B != 0) {
            long R = A % B; // 나머지
            A = B;
            B = R;
        }
        return A;
    }
}