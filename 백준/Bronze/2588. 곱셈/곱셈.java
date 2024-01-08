import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		String b = sc.nextLine();
		sc.close();

		System.out.println(Integer.parseInt(b.substring(2, 3)) * a);
		System.out.println(Integer.parseInt(b.substring(1, 2)) * a);
		System.out.println(Integer.parseInt(b.substring(0, 1)) * a);
		System.out.println(Integer.parseInt(b) * a);
	}
}