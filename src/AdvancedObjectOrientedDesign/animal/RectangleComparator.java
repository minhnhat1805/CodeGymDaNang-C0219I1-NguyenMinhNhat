package AdvancedObjectOrientedDesign.animal;



import ClassAndObject.Rectangle;

import java.util.Comparator;
public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle R1,Rectangle R2) {
        if (R1.getArea() > R2.getArea()) {
            return 1;
        } else {
            if (R1.getArea() < R2.getArea()) {
                return -1;
            } else return 0;
        }
    }
}
