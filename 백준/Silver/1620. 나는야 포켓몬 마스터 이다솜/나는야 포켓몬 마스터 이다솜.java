import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<Integer, String> intMap = new HashMap<Integer, String>();
        Map<String, Integer> strMap = new HashMap<String, Integer>();
        for(int i = 1; i <= N; i++) {
            String name = br.readLine();
            intMap.put(i, name);
            strMap.put(name, i);
        }
        
        for(int i = 0; i < M; i++) {
            String qes = br.readLine();
            if(qes.chars().allMatch(Character::isDigit)) { // NUMBER
                sb.append(intMap.get(Integer.parseInt(qes)));
            } else {                                       // STRING
                sb.append(strMap.get(qes));
            }
            sb.append("\n");
        }
        br.close();

        System.out.println(sb);
    }
}