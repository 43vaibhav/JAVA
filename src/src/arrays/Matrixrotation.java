package arrays;

import java.util.Scanner;

public class Matrixrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] grid = new int[rows][cols];

        // Input the matrix elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Rotate matrix
        int[][] grid1 = matrixRotate(grid, rows, cols);

        // Print rotated matrix
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[0].length; j++) {
                System.out.print(grid1[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    // Method to rotate the matrix 90° clockwise
    public static int[][] matrixRotate(int[][] grid, int rows, int cols) {
        int[][] grid1 = new int[cols][rows]; // rotated dimensions

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                grid1[i][j] = grid[j][cols - 1 - i];
            }
        }   
        return grid1;
    }
}
