import  java.util.Scanner;
public class year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year which you want to test: ");
        int year =  sc.nextInt();
        boolean test = false;
        if (year % 4 ==0) {
            if (year % 100!=0) {
                test= true;
            } else {
                if (year % 400 !=0) {
                    test =false;
                } else {
                    test = true;
                }
            }
        }
        if (test) {
            System.out.printf("%d  is a leap year",year);
        }else{
            System.out.printf("%d  is  NOT a leap year",year);
        }
    }

}
