import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int M = Integer.parseInt(st.nextToken());
        int[] sum = new int[arr.length + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i + 1] = sum[i] + arr[i];
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sIdx = Integer.parseInt(st.nextToken());
            int eIdx = Integer.parseInt(st.nextToken());
            
            sb.append(sum[eIdx] - sum[sIdx - 1]).append("\n");
        }

        // 시간초과.
        // st = new StringTokenizer(br.readLine());
        // for(int i = 0; i < arr.length; i++) {
        //     arr[i] = Integer.parseInt(st.nextToken());
        // }

        // for(int i = 0; i < M; i++) {
        //     st = new StringTokenizer(br.readLine());
        //     int sIdx = Integer.parseInt(st.nextToken()) - 1;
        //     int eIdx = Integer.parseInt(st.nextToken());

        //     int sum = 0;
        //     for(int j = sIdx; j < eIdx; j++) {
        //         sum += arr[j];
        //     }
        //     sb.append(sum).append("\n");
        // }

        br.close();

        System.out.println(sb);
    }
}