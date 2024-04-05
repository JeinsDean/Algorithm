import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= 10000; i++) {
            list.add(i);
        }

        for(int i = 1; i <= 10000; i++) {
            String str = String.valueOf(i);
            int sum = i;
            for(char c : str.toCharArray()) {
                sum += c - '0';
            }

            if(sum > 10000) {
                continue;
            }

            list.remove(Integer.valueOf(sum));
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}