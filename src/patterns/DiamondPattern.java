package patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // height of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
        	
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond
        for (int l = n - 1; l >= 1; l--) {
            // Print spaces
            for (int j = n; j > l; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int m = 1; m <= (2 * l - 1); m++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
