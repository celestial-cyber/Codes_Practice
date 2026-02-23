//waveform -> input 6 
// 5 1 2 6 4 3 
// output = 2 1 4 3 6 5 
import java.util.*;

class program1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[] = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        // Step 1: Sort the array
        Arrays.sort(array);

        // Step 2: Swap adjacent elements in pairs
        for(int i = 0; i < size - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }

        // Print result
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
