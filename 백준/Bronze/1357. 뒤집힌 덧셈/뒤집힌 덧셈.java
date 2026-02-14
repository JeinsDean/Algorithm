import java.util.Scanner;

public class Main {
	private static int rev(int num) {
       int result = 0;
            while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
       return result; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();

        sc.close();
	
        int result = rev(rev(x) + rev(y));
        System.out.println(result);
	}
}