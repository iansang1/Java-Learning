
 // This program contains the corrected versions of three infinite loops.

public class InfiniteLoopDebug {
    public static void main(String[] args) {

        // BUG 1: Print numbers 1 to 5
        System.out.println("=== BUG 1 ===");

        int x = 1;

        while (x <= 5) {
            System.out.println("x = " + x);
            x++;
        }

        // BUG 2: Countdown from 5 to 1
        System.out.println("\n=== BUG 2 ===");

        for (int i = 5; i >= 1; i--) {
            System.out.println("i = " + i);
        }

        // BUG 3: Countdown from 10 to 1
        System.out.println("\n=== BUG 3 ===");

        int y = 10;

        while (y > 0) {
            System.out.println("y = " + y);
            y--;
        }

        System.out.println("\nAll loops fixed successfully!");
    }
}
