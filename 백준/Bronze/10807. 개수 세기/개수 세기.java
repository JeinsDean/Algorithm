import java.util.Scanner;

class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] arr = new int[sc.nextInt()];
                int cnt = 0;
                int tgt = 0;

                for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();
                }

                tgt = sc.nextInt();
                for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == tgt)
                                cnt++;
                }
                sc.close();
                System.out.println(cnt);
        }
}