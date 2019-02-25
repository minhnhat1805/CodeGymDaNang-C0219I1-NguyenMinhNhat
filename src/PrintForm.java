import java.util.Scanner;
public class PrintForm {
    public static void Rectangle(int row, int colume) {
        for (int i=1;i<=row;i++) {
            for(int j=1;j<=colume;j++) {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");

        while (true) {
            System.out.println("Please choose your number:");
            int i,j,t;
            int number = sc.nextInt();
            switch (number){
                case 1:
                    System.out.println("Please enter row:");
                    int row = sc.nextInt();
                    System.out.println("Please enter colume:");
                    int colume = sc.nextInt();
                    Rectangle(row, colume);
                    break;
                case 2:
                    for (i=5;i>=0;i--) {
                        for (j=0;j<=i;j++) {
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                    }
                    for (i=1;i<=5;i++) {
                        for (j=1;j<=i;j++) {
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                    }
                    for (j = 5; j >= 1; j--) {
                        for (t = 1; t < j; t++) {
                            System.out.printf("  ");
                        }

                        for (i = 5; i >= j; i--) {
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                    }
                    for (j=5;j>=1;j--) {
                        for (t=5;t>j;t--) {
                            System.out.printf("  ");
                        }
                        for(i=1;i<=j;i++) {
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                        }
                    break;
                case 3:
                    for (j = 5; j >= 1; j--) {
                        for (t = 1; t < j; t++) {
                            System.out.printf(" ");
                        }

                        for (i = 5; i >= j; i--) {
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    break;
            }
                    }

        }
        }