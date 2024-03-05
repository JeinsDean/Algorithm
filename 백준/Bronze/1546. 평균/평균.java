import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[Integer.parseInt(br.readLine())];
        int max = 0;
        float avg = 0;
        String[] tmp = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
            max = max > arr[i] ? max : arr[i];
        }

        for (int i : arr) {
            avg += (float)i / max * 100;
        }
        avg = avg / arr.length;

        System.out.println(avg);
    }
}