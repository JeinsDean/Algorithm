import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            if(list.contains(str)) {
                continue;
            }
            list.add(str);
        }
        br.close();

        String[] arr = list.toArray(new String[list.size()]);
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        
        for (String str : arr) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}