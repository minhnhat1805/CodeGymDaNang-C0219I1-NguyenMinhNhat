package ClassAndObject;

public class TheCircle {
    //Main program
    public static void main(String[] args) {
        TheCircle circle = new TheCircle();
        System.out.println(circle);
        circle = new TheCircle(3);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(2,3);
        System.out.println(cylinder);
    }

    private double radius=1;
    public TheCircle(){

    }
    public  TheCircle(double radius){
        this.radius = radius;
    }
    public  double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public String toString(){
        return "The CIRCLE have radius = "+getRadius()+"// AREA = "+getArea();
    }
}



class Cylinder extends TheCircle {
    private double hight=1;
    public Cylinder(){

    }
    public Cylinder(double hight,double radius) {
        super(radius);
        this.hight = hight;
    }
    public double getHight(){
        return this.hight ;
    }
    public void setHight(double hight) {
        this.hight = hight;
    }
    public  double cylinderVolume(){
        return super.getArea()*this.hight;
    }
    @Override
    public String toString(){
        return "The Cylinder have higth = "+getHight()+ "// radius of Bottom  = " +super.getRadius()+" // Volume CYLINDER = "+cylinderVolume();
    }
}
