import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		for(int i = 1; i <= cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
		}
		sc.close();
	}
}