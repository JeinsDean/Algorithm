import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str = br.readLine();
                br.close();

                System.out.printf("%d", (int) str.charAt(0));
        }
}