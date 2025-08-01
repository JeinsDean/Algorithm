import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;

        do {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            if(a != 0 && b != 0) {
                System.out.println(a + b);
            }
        }  while (!Arrays.stream(input).allMatch(s -> s.equals("0")));

        br.close();
    }
}