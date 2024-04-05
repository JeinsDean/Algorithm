import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        int sum = 0;
        int tmp = 0;
        for(int i = 0; i <= arr.length - 2; i++) {
            for(int j = i + 1; j < arr.length - 1; j++) { 
                for(int k = j+1; k < arr.length; k++) { 
                    sum = arr[i] + arr[j] + arr[k]; 
                    if(sum > tmp && sum <= M){ 
                        tmp = sum;
                    }
                }
            }
        }

        System.out.println(tmp);
    }
}