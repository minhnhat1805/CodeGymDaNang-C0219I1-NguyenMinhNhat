package Array;
import java.util.Scanner;
public class FindMaxIn2_Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please make one 2-array. ");
        System.out.println("Enter row:");
        int row = scanner.nextInt();
        System.out.println("Enter colume:");
        int colume = scanner.nextInt();
        int[][]  array = new int[row][colume];

        for (int i=0;i<row;i++) {
            for (int j=0;j<colume;j++) {
                System.out.println("Please you enter element of array:");
                int element = scanner.nextInt();
                array[i][j] = element;

            }

        }
        for (int i=0;i<row;i++) {
            for (int j=0;j<colume;j++) {
                System.out.printf(array[i][j]+ "\t");
            }
            System.out.printf("\n");
        }

        int max =array[0][0];
        int indexRow=0,indexColume=0;


        for (int i=0;i<row;i++) {
            for (int j=0;j<colume;j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexRow =i;
                    indexColume = j;
                }
            }
        }
       System.out.printf("Value MAX of ARRAY: array["+indexRow+"]["+indexColume+"] = "+max);

    }
}
