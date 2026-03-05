import java.util.Scanner;

public class Main {

    public static void manchester(int n, int[] arr) {

        int prev = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == prev) {
                count++;
                System.out.print(count + " ");
            } else {
                count = 0;
                System.out.print("0 ");
            }

            prev = arr[i];
        }
    }

    public static void program4(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        manchester(n, arr);
    }
}