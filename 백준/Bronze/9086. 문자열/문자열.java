import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int cnt = Integer.parseInt(br.readLine());

                for (int i = 0; i < cnt; i++) {
                        String str = br.readLine();
                        System.out.println(str.substring(0, 1) + str.substring(str.length()-1, str.length()));
                }
                br.close();
        }
}