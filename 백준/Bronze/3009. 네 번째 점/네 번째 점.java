import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][2];
        
        // 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
        // 직사각형의 네 번째 점의 좌표를 출력한다.
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int x = 0, y = 0;
        if(arr[0][0] == arr[1][0]) {
            x = arr[2][0];
        } else if(arr[0][0] == arr[2][0]){
            x = arr[1][0];
        } else {
            x = arr[0][0];
        }

        if(arr[0][1] == arr[1][1]) {
            y = arr[2][1];
        } else if(arr[0][1] == arr[2][1]){
            y = arr[1][1];
        } else {
            y = arr[0][1];
        }
        System.out.println(x + " " + y);
    }
}