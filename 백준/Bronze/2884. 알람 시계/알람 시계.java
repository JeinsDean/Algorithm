import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		if (h == 0 && m < 45) {
			h = 23;
			m = m + 60;
		} else if (m < 45) {
			h = h - 1;
			m = m + 60;
		}
		m = m - 45;

		System.out.println(h + " " + m);
	}
}