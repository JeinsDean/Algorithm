import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));

    }

    static long factorial(int num) {
        long result = 1;

        while (num > 0) {
            result *= num;
            num--;
        }

        return result;
    }
}
