package Array;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int size,i=0;
        int[] array ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size must be less than 20");
            }
        } while (size > 20) ;
        array = new int[size];
        while (i<array.length) {
            System.out.println("Enter element "+(i+1)+" of array:");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Your array:");
        for(i=0;i<array.length;i++) {
            System.out.print(array[i] +"\t");
        }
        System.out.printf("\n");
        for (i=0;i<array.length/2;i++) {
            int temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }
        System.out.println("Your array after reverse:");
        for (i=0;i<array.length;i++) {
            System.out.printf(array[i]+"\t");
        }

        }
    }
