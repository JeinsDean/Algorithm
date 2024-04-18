import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<Integer>();
        Set<Integer> B = new HashSet<Integer>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (A.contains(val)) {
                A.remove(val);
            } else {
                B.add(val);
            }
        }
        br.close();

        System.out.println(A.size() + B.size());
    }
}