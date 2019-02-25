import java.util.Scanner;
public class equation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", +solution);
        } else {
            if (b==0) {
                System.out.println("Phương trình vô số nghiệm:");
            } else {
                System.out.println(" Phương trình vô nghiệm:");
            }
        }
    }
    }
