package Array;
import java.util.Scanner;
public class CalculateTheTotalDiagonal {
    public static void main(String[] args) {
        System.out.println("Make one trix!");
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter width of matrix:");
            int width = scanner.nextInt();
            int[][] matrix = new int[width][width];
            for (int i=0;i<width;i++) {
                for (int j=0; j < width;j++) {
                    matrix[i][j]= scanner.nextInt();
                }
            }
            System.out.println("Your matrix:");
            for (int i=0;i<width;i++) {
                for (int j=0; j < width;j++) {
                    System.out.printf(matrix[i][j] +"\t");
                }
                System.out.printf("\n");
            }
            int sum=0;
            for (int i=0;i<width;i++) {
                for (int j=0; j < width;j++) {
                    if (j==i){
                        sum+=matrix[i][j];
                    }
                }

            }
            System.out.println("Total diagonal: "+sum);

        }while (true);

    }
}
