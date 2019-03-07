package AdvancedObjectOrientedDesign.animal;

import ClassAndObject.Rectangle;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0]= new Rectangle();
        rectangles[1] = new Rectangle(2.3,4.5);
        rectangles[2] = new Rectangle(1.4,3.6,"yellow",true);

        System.out.println("Before Sort:");
        for (Rectangle rectangles1:rectangles){
            System.out.println(rectangles1);
        }

        //Comparator rectangleComparator = new RectangleComparator();// Cấu trúc : interface name_object = new name_class chứa interface
        Arrays.sort(rectangles,new RectangleComparator());

        System.out.println("After sort:");
        for (Rectangle rectangles1:rectangles){
            System.out.println(rectangles1);
        }



    }
}
