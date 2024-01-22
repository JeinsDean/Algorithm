import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        
        String s = "";
        char c;
        for(int i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            if((c >= 65) && (c <= 90)) {
                s += a.valueOf(c).toLowerCase();
            } else if((c >= 97) && (c <= 122)) {
                s += a.valueOf(c).toUpperCase();
            } else {
                s += (char)c;
            }
        }
        System.out.println(s);
        
        
    }
}