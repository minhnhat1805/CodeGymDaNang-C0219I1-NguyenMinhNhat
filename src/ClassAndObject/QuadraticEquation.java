package ClassAndObject;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        do {Scanner scanner= new Scanner(System.in);
            System.out.println("Enter a: ");
            double a= scanner.nextDouble();
            System.out.println("Enter b: ");
            double b= scanner.nextDouble();
            System.out.println("Enter c: ");
            double c= scanner.nextDouble();
            QuadraticEquation qua = new QuadraticEquation(a,b,c);
            qua.getA();
            qua.getB();
            qua.getC();
            qua.getDiscriminant();
            qua.getRoot1();
            qua.getRoot2();
            qua.show();
        } while (true);
    }
    double a, b, c;

    public QuadraticEquation(double a,double b,double c) {
    this.a=a;
    this.b=b;
    this.c=c;
    }

    public double getA() {
     return this.a;
    }
    public  double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant(){
        return (this.b*this.b)- (4*this.a*this.c);

    }
    public double getRoot1() {
            return  ((-this.b) + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
        }

    public double getRoot2() {
            return  ((-this.b) - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);

    }
    public void show(){
         double dental = getDiscriminant();
         if (dental>=0) {
             if (dental>0) {
                 System.out.println("The root1 = " + getRoot1() + "\n" + "The root2 = " + getRoot2());
             }else {
                 System.out.println("The root ="+getRoot1());
             }
         }else {
             System.out.println("The equation has no roots!");
             }
         }
    }