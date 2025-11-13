import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Task 1: If the entered number is greater than 7, then print “Hello”
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Hello");
        }

        // --- Task 2: If the entered name matches “John”, then output “Hello, John”, if not – “There is no such name”
        System.out.print("Enter a name: ");
        String name = scanner.next();
        if (name.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        // --- Task 3: Given an array, output elements that are multiples of 3
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean found = false;

        for (int num : arr) {
            if (num % 3 == 0) {
                if (!found) {
                    System.out.println("Numbers that are multiples of 3:");
                    found = true;
                }
                System.out.println(num);
            }
        }

        if (!found) {
            System.out.println("There are no elements that are multiples of 3.");
        }

    }
}
