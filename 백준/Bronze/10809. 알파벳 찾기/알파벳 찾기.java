import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chr = str.toCharArray();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (char c : chr) {
            arr[c - 97] = str.indexOf(c);
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}