import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(arr, num)).append(" ");
        }
        br.close();

        System.out.println(sb);
    }

    private static int binarySearch(int[] arr, int num) {
        var lt = 0;
        var rt = arr.length - 1;
        // 0, 4


        while (lt <= rt) {
            var midIdx = Math.floorDiv((lt + rt), 2);
            var midVal = arr[midIdx];

            if(num > midVal) { 
                lt = midIdx + 1;
            } else if (num < midVal) {
                rt = midIdx - 1;
            } else {
                return 1;
            }
        }

        return 0;
    }

}