package ClassAndObject;

public class Point2D {

    private float x = 0.0f ;
    private float y = 0.0f;

    public Point2D(){

    }
    public Point2D(float x,float y){
         this.x = x;
         this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY (){
        return this.y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x, float y ){
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = {this.x, this.y};
        return xy;
    }
    public String toString(){
       return "Value x ="+this.x+"// Value = "+this.y;
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        float[] xy = point2D.getXY();
        System.out.println(String.format("X: %f, Y: %f", xy[0], xy[1]));

        Point2D point2D1 = new Point2D(3,3);
        float[] xy1 = point2D1.getXY();
        System.out.println(String.format("X= %f, Y= %f",xy1[0],xy1[1]));
    }
}
