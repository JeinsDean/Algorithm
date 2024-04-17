import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            if(map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
                continue;
            }
            map.put(val, 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int val = Integer.parseInt(st.nextToken());
            if(map.containsKey(val)) {
                sb.append(map.get(val));
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }
        br.close();

        System.out.println(sb);
    }
}