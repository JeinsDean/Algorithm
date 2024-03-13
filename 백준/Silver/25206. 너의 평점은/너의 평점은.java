import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double cnt = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String object = st.nextToken();
            double val = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            cnt += val;
            switch (grade) {
                case "A+":
                    sum += val * 4.5;
                    break;
                case "A0":
                    sum += val * 4.0;
                    break;
                case "B+":
                    sum += val * 3.5;
                    break;
                case "B0":
                    sum += val * 3.0;
                    break;
                case "C+":
                    sum += val * 2.5;
                    break;
                case "C0":
                    sum += val * 2.0;
                    break;
                case "D+":
                    sum += val * 1.5;
                    break;
                case "D0":
                    sum += val * 1.0;
                    break;
                case "F":
                    sum += val * 0;
                    break;
                case "P":
                    cnt -= val;
                    break;
            }
        }
        br.close();
        System.out.println(sum / cnt);
        
    }
}