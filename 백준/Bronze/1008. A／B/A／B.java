import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b = 0;

		do {
			a = sc.nextInt();
			b = sc.nextInt();
		} while ((10 <= a || a <= 0) || (10 <= b || b <= 0));
		sc.close();

		System.out.println(a / b);
	}
}