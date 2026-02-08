import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int num = 0;

    public static String recursion(String s, int l, int r) {
        num++;
        if (l >= r)
            return "1 " + num + "";
        else if (s.charAt(l) != s.charAt(r))
            return "0 " + num + "";
        else
            return recursion(s, l + 1, r - 1);
    }

    public static String isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            String input = br.readLine();
            System.out.println(isPalindrome(input));
            num = 0;
        }
    }
}