package AdvancedObjectOrientedDesign.animal;

import ClassAndObject.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(2.5);
        squares[2] = new Square(1.4,"blue",true);
        for (Square square:squares) {
            if(square instanceof Colorable){
                System.out.println(square.getArea());
                square.howToColor();
            }
        }
    }
}
