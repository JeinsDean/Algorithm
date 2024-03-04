import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        for(int x = 0; x < m; x++) {
            String tmp = br.readLine();
            st = new StringTokenizer(tmp);
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(int y = i - 1; y < j; y++) {
                arr[y] = k;
            }
        }
        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }
}
