package Start_Java;

import  java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        if (a==0 && b==0) {
            System.out.println("No greatest common factor");
        }
        while (a!=b) {
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.printf("Greatest Common Divisor of a and b is: %d", a);
    }
}

