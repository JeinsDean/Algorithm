import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time = br.readLine().split(" ");
        br.close();

        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);

        if(m < 45) {
            h = h == 0 ? 23 : h - 1;
            m = m + 60;
        }
        System.out.println(h + " " + (m - 45));

    }
}