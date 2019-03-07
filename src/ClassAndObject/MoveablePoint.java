package ClassAndObject;
class MoveablePoint extends Point2D {
     private float xSpeed= 0.0f;
     private  float ySpeed = 0.0f;
     public MoveablePoint(){

     }
     public MoveablePoint(float xSpeed,float ySpeed){
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
     }
     public MoveablePoint(float x,float y, float xSpeed, float ySpeed){
         super(x,y);
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
     }
     public float getxSpeed(){
         return this.xSpeed;
     }
     public void setxSpeed(float xSpeed){
         this.xSpeed = xSpeed;
     }
     public float getySpeed(){
         return this.ySpeed;
     }
     public void setySpeed(float ySpeed){
         this.ySpeed = ySpeed;
     }
     public void setSpeed(float xSpeed,float ySpeed){
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
     }
     public float[] getSpeed(){
         float[] xyS = {this.xSpeed,this.ySpeed};
         return xyS;
     }
     public  String toString(){
         return "X="+super.getX()+"  Y="+super.getY()+"  XSpeed="+this.xSpeed+"  YSpeed="+this.ySpeed;
     }
     public MoveablePoint move(){
          setX(super.getX()+this.xSpeed);
          setY(super.getY()+this.ySpeed);
         return this;
     }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());

        MoveablePoint moveablePoint1 = new MoveablePoint(12,15);
        System.out.println(moveablePoint1);
        System.out.println(moveablePoint1.move());

        MoveablePoint moveablePoint2 = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint2);
        System.out.println(moveablePoint2.move());
    }
}
