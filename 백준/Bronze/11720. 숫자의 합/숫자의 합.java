import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int cnt = Integer.parseInt(br.readLine());
                String str = br.readLine();
                int sum = 0;
                br.close();

                for (int i = 0; i < cnt; i++) {
                        sum += Integer.parseInt(str.substring(i, i + 1));
                }
                System.out.println(sum);
        }
}