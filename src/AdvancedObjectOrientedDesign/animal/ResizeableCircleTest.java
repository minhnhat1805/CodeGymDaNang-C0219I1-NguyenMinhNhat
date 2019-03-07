package AdvancedObjectOrientedDesign.animal;


import ClassAndObject.Circle;
import ClassAndObject.Rectangle;
import ClassAndObject.Shape;
import ClassAndObject.Square;

public class ResizeableCircleTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(1,4);
        shapes[2]= new Square(1.5);
        for(Shape shape:shapes) {
            System.out.println(shape.getArea());
        }
   
        System.out.println("after set reize");
        for(Shape shape:shapes) {
            shape.resize(Math.random());
            System.out.println(shape.getArea());
        }
    }
}