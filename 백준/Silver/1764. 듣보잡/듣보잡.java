import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        Set<String> tgt = new TreeSet<String>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                tgt.add(name);
                cnt++;
            }
        }
        br.close();

        sb.append(cnt).append("\n");
        for (String str : tgt) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}
