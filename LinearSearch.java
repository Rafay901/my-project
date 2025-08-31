import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Get array size and elements
        System.out.print("How many numbers? ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Step 2: Get target to search
        System.out.print("Which number do you want to find? ");
        int target = scanner.nextInt();
        
        // Step 3: LINEAR SEARCH LOGIC
        int position = -1;  // -1 means not found
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {  // Found the target
                position = i;         // Remember the position
                break;               // Stop searching
            }
        }
        
        // Step 4: Show result
        if (position == -1) {
            System.out.println("Number " + target + " not found!");
        } else {
            System.out.println("Number " + target + " found at position " + position);
        }
        
        scanner.close();
    }
}