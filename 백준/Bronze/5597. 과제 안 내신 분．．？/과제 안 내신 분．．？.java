import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= 30; i ++) {
            list.add(i);
        }

        for(int i = 1; i <= 28; i++) {
            list.remove((Object)Integer.parseInt(br.readLine()));
        }
        Arrays.sort(list.toArray());
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
