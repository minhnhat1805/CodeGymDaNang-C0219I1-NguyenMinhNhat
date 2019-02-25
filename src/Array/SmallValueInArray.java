package Array;
import java.util.Scanner;
public class SmallValueInArray {
    public static int MinValue(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++) {
            System.out.println("Enter element "+(i+1)+":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("The value min in your array : "+ MinValue(arr));
    }
    }
