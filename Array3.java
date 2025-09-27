package javaprograms;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the depth: ");
        int depth = input.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        int[][][] threeDArray = new int[depth][rows][cols];

        System.out.println("Enter " + (depth * rows * cols) + " elements:");
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print("Element at [" + i + "][" + j + "][" + k + "]: ");
                    threeDArray[i][j][k] = input.nextInt();
                }
            }
        }

        System.out.println("\n3D Array Elements:");
        for (int i = 0; i < depth; i++) {
            System.out.println("Depth " + i + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
           System.out.println(); 
        }

        input.close();
    }
}