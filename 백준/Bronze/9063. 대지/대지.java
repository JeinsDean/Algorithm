import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        
        int minX = 10000, maxX = -10000;
        int minY = 10000, maxY = -10000;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int tempX = Integer.parseInt(st.nextToken());
            int tempY = Integer.parseInt(st.nextToken());

            minX = Math.min(minX, tempX);
            maxX = Math.max(maxX, tempX);
            minY = Math.min(minY, tempY);
            maxY = Math.max(maxY, tempY);
        }
        br.close();

        int x = maxX - minX;
        int y = maxY - minY;
        System.out.println(x * y);
    }
}