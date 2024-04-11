import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.length() != b.length()) {
                    return a.length() - b.length();
                } else {
                    return a.compareTo(b);
                }
            }
        });
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        br.close();

        for(String s : set){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}