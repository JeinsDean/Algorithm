import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            for (String s : arr) {
                if ("ChongChong".equals(s)) {
                    set.addAll(Arrays.asList(arr));
                    break;
                }

                if (set.contains(s)) {
                    set.addAll(Arrays.asList(arr));
                    break;
                }
            }
        }
        br.close();

        System.out.println(set.size());
    }
}