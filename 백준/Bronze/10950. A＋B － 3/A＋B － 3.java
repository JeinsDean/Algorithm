import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] arr = new int[sc.nextInt()];

                for (int i = 0; i < arr.length; i++) {
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        arr[i] = a + b;
                }
                sc.close();

                for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                }
        }

}
