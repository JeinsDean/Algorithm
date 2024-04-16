import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<String> set = new TreeSet<String>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String stat = st.nextToken();

            if("enter".equals(stat)) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        
        for (String name : set) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}