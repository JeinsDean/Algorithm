import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if ("ENTER".equals(str)) {
                cnt += set.size();
                set.clear();
            } else {
                set.add(str);
            }
        }
        cnt += set.size();
        br.close();

        System.out.println(cnt);
    }
}