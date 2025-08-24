import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();      // Read integer
        double d = scanner.nextDouble(); // Read double
        scanner.nextLine();             // Consume the leftover newline
        String s = scanner.nextLine();  // Read string

        scanner.close();

        // Print in reverse order
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
