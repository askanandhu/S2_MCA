import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input dimensions of the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int columns1 = scanner.nextInt();
        
        // Declare the first matrix
        int[][] matrix1 = new int[rows1][columns1];
        
        // Input elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        // Input dimensions of the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();
        
        // Check if the dimensions match
        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Error: Matrices must have the same dimensions for addition.");
        } else {
            // Declare the second matrix
            int[][] matrix2 = new int[rows2][columns2];
            
            // Input elements of the second matrix
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < columns2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            
            // Declare the sum matrix
            int[][] sumMatrix = new int[rows1][columns1];
            
            // Add the matrices
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            
            // Display the sum matrix
            System.out.println("The sum of the matrices is:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
