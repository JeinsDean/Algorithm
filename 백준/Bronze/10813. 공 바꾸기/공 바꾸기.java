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
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for(int x = 0; x < m; x++) {
            String tmp = br.readLine();
            st = new StringTokenizer(tmp);
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int num = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = num;
        }
        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }
}
