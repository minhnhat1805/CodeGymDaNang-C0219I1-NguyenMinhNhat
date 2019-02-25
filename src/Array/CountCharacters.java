package Array;
import java.util.Scanner;
public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.println("Enter your string: ");
        str = sc.nextLine();
        System.out.println("Enter Character: ");
        String character = sc.nextLine();
        String[] output = str.split("");
        int count=0;
        for (int i=0;i<output.length;i++) {
            System.out.printf(output[i] +"\t");

            if(output[i].equals(character)) {
             count++;

            }
        }
        System.out.printf("\n");
        System.out.println("There are "+count+" character "+character+" in your string");

    }
}
