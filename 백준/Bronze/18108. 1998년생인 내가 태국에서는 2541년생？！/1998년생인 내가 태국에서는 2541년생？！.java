import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = 0;

		y = sc.nextInt();
		sc.close();

		y = y - 543;

		System.out.println(y);
	}
}