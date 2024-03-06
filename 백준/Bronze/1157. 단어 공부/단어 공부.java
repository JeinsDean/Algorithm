import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        Set<Character> set = new HashSet<Character>();
        int cnt = 0;
        String ans = "";
        
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        for (Character c : set) {
            int tmp = str.length() - str.replace(c.toString(), "").length();
            if(cnt == tmp) {
                ans = "?";
            } else if(cnt < tmp) {
                cnt = tmp;
                ans = c.toString();    
            }
        }
        System.out.println(ans);        
    }
}