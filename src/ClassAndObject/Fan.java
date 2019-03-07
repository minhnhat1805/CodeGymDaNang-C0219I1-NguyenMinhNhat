package ClassAndObject;

public class Fan {
    public static final int SLOW =1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed =SLOW;
    private boolean on;
    private double radius= 5;
    private String color="blue";

    public Fan() {

    }
    public Fan(int speed,boolean on,double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString() {
        if (this.on) {
            return "Speed:" +getSpeed()+"\n"+"Color: "+getColor()+"\n"+"Radius:"+getRadius()+"\n"+"fan is on";
        }else {
            return "Speed:" +getSpeed()+"\n"+"Color: "+getColor()+"\n"+"Radius:"+getRadius()+"\n"+"fan is off";
        }
    }
    public static void main(String[] args) {
        //Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.

        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.getOn();
        fan1.setSpeed(Fan.FAST);
        fan1.getSpeed();
        fan1.setRadius(10);
        fan1.getRadius();
        fan1.setColor("yellow");
        fan1.getColor();
        System.out.println("First fan parameter:");
        System.out.println(fan1.toString());
        //Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.getOn();
        fan2.setSpeed(fan1.MEDIUM);
        fan2.getSpeed();
        fan2.setRadius(5);
        fan2.getRadius();
        fan2.getColor();
        System.out.println("Second fan parameter:");
        System.out.println(fan2.toString());
    }
    //getter setter
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public boolean getOn(){
        return this.on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }



}
