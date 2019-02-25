package Array;

import java.util.Scanner;

public class CalculateTotalColume {
    public static void main(String[] args) {
        System.out.println("Make one trix!");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter width of matrix:");
            int width = scanner.nextInt();
            System.out.println("Enter hight of matrix:");
            int hight = scanner.nextInt();
            int[][] matrix = new int[hight][width];
            for (int i=0;i<hight;i++) {
                for (int j=0; j < width;j++) {
                    matrix[i][j]= scanner.nextInt();
                }
            }
            System.out.println("Your matrix:");
            for (int i=0;i<hight;i++) {
                for (int j=0; j < width;j++) {
                    System.out.printf(matrix[i][j] +"\t");
                }
                System.out.printf("\n");
            }
            System.out.println("Enter colume which you want count total:");
            int colume = scanner.nextInt();
            int sum=0;
            if (colume<0 ||colume>hight) {
                System.out.println("Value NOT invalid!");
            } else {
                for (int i=0;i<hight;i++) {
                    sum+=matrix[i][colume];
                }
            }

            System.out.println("Total diagonal: "+sum);

        }while (true);

    }
}
