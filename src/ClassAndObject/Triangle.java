package ClassAndObject;
import java.util.Scanner;
class Triangle extends Shape{
     private  double side1=1;
     private  double side2=1;
     private  double side3=1;
     public  Triangle(){

     }
     public Triangle(String color, boolean filled, double side1, double side2, double side3){
         super(color,filled);
         this.side1=side1;
         this.side2 = side2;
         this.side3 = side3;

     }

     public double getArea(){
         //Sử dụng công thức He-ron để tính diện tích tam giác

        return  Math.sqrt((this.getPerimeter()/2)
                *((this.getPerimeter()/2)-this.side1)
                *((this.getPerimeter()/2)-this.side2)
                *((this.getPerimeter()/2)-this.side3));
     }
     public  double getPerimeter(){
         return this.side1+this.side2+this.side3;
     }
     public String toString(){
         return "Triangle have color: "+super.getColor()+"\n"
                 + "AREA triangle= "+getArea()+"\n"
                 +"PERIMETER triangle ="+getPerimeter();
     }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        System.out.println(triangle);

    do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3:");
        double side3 = scanner.nextDouble();

        Triangle triangle1 = new Triangle("yellow",true,side1,side2,side3);
        System.out.println(triangle1);
    }while (true);
    }
}
