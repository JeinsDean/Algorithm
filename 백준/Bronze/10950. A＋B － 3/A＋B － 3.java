import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int[] arr = new int[x];

                for (int i = 0; i < x; i++) {
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        arr[i] = a + b;
                }
                sc.close();

                for (int i = 0; i < x; i++) {
                        System.out.println(arr[i]);
                }
        }

}
