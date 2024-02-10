import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int cnt = Integer.parseInt(br.readLine());
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < cnt; i++) {
                        String tmp = br.readLine();
                        StringTokenizer st = new StringTokenizer(tmp);
                        int r = Integer.parseInt(st.nextToken());
                        String str = st.nextToken();

                        char[] arr = str.toCharArray();
                        for (char c : arr) {
                                sb.append(String.valueOf(c).repeat(r));
                        }
                        sb.append("\n");
                }
                br.close();

                System.out.println(sb);

        }
}