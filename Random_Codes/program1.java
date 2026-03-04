import java.util.*;

public class program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nChoose an option:");
        System.out.println("1 -> Maximum Element");
        System.out.println("2 -> Minimum Element");
        System.out.println("3 -> k-th Largest Element");
        System.out.println("4 -> k-th Smallest Element");

        int choice = sc.nextInt();

        Arrays.sort(arr);   // Sort once

        switch(choice) {

            case 1:
                System.out.println("Maximum element is: " + arr[n - 1]);
                break;

            case 2:
                System.out.println("Minimum element is: " + arr[0]);
                break;

            case 3:
                System.out.print("Enter value of k: ");
                int kLargest = sc.nextInt();

                if(kLargest > 0 && kLargest <= n)
                    System.out.println(kLargest + "th largest element is: " + arr[n - kLargest]);
                else
                    System.out.println("Invalid value of k");
                break;

            case 4:
                System.out.print("Enter value of k: ");
                int kSmallest = sc.nextInt();

                if(kSmallest > 0 && kSmallest <= n)
                    System.out.println(kSmallest + "th smallest element is: " + arr[kSmallest - 1]);
                else
                    System.out.println("Invalid value of k");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}