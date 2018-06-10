import java.util.Formatter;
import java.util.Scanner;

public class task_1_5_main_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize;

        System.out.print("Input size of matrix: ");
        matrixSize = scanner.nextInt();

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i=0 ; i<matrixSize ; i++) {
            for (int j=0 ; j<matrixSize ; j++) {
                if ((i==j)||((i+j)==(matrixSize-1))) {
                    matrix[i][j] = 1;
                }
                else
                    matrix[i][j] = 0;
            }
        }

        System.out.println();

        for (int i=0 ; i<matrixSize ; i++) {
            for (int j=0 ; j<matrixSize ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
