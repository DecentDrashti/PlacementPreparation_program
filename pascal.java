import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int[][] triangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            // Every row starts and ends with 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            // Fill the middle numbers
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        // Print the triangle
        for (int i = 0; i < n; i++) {
            // Optional: Print spaces for the "pyramid" look
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
