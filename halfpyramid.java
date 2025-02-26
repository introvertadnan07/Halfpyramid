import java.util.*;

public class HalfPyramid {
    public static void invertedRotatedHalfPyramid(int n) {
        // Outer loop for rows
        for (int i = n; i >= 1; i--) { // Start from `n` and go down to 1
            // Spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        invertedRotatedHalfPyramid(5); // Try with 5 before increasing
    }
}
