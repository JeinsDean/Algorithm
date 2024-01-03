import java.util.Scanner;

// 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b = 0;

		do {
			a = sc.nextInt();
			b = sc.nextInt();
		} while ((10000 < a || a < 1) || (10000 < b || b < 1));
		sc.close();

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
