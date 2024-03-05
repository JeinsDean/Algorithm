import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dial = br.readLine();
        int time = 0;

        for(int i = 0; i < dial.length(); i++) {
            time = time + 2;
            switch (dial.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    time = time + 1;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    time = time + 2;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    time = time + 3;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    time = time + 4;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    time = time + 5;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    time = time + 6;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    time = time + 7;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    time = time + 8;
                    break;
                default:
                    break;
            }
        }
        System.out.println(time);
        
    }
}