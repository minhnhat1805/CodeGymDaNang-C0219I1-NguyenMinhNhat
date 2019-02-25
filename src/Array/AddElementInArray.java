package Array;
import java.util.Scanner;
public class AddElementInArray {
    public static int [] insert(int [] arr, int k,int index) {

        int [] newArr = new int [arr.length + 1];
        for (int i=0;i<index;i++) {
            newArr[i] = arr[i];
        }
        newArr[index]=k;
        for (int i=index+1;i<newArr.length;i++) {
            newArr[i] =arr[i-1];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0 ; i<array.length;i++) {
            System.out.println("Element "+(i+1)+" :");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the number which you need insert:");
        int X = scanner.nextInt();
        System.out.println("Enter index which you need insert");
        int index = scanner.nextInt();

        if (index<=1 && index>=array.length-1) {
            System.out.println("CAN'T insert :");
        }
       // System.out.println(insert(array, X,index));
        int[] newArr = insert(array,X,index);

        for (int element : newArr) {
            System.out.printf(element +"\t");
        }

     }

    }
