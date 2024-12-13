package Matrix;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        //constant variables
        Scanner sc = new Scanner(System.in);

        //variables
        int row;
        int col;
        int [][] matrix;

        System.out.println("** Diagonal Sum **");

        System.out.println("Enter the row number");
        row = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the column number");
        col = Integer.parseInt(sc.nextLine());

        matrix = new int[row][col];

        System.out.println("Enter the values for the array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value: [" + i + ", " + j + "]");
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("Diagonal Sum: " + calculateDiagonalSum(matrix));

    }

    public static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
