package ClassAndObject;

class Point3D extends Point2D {
    private float z =0.0f;
    public  Point3D(){

    }
    public Point3D (float x, float y,float z) {
        super(x,y);
        this.z = z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z =z;
    }
    public float[] getXYZ(){
        float[] xyz = {super.getX(),super.getY(),this.z};
        return xyz;
    }
    public String toString(){
        return "Value x "+super.getX()+"// Value y = "+super.getY()+"// Value z = "+this.z;
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        float[] xyz = point3D.getXYZ();
        System.out.println(String.format("X= %f, Y=%f, Z=%f",xyz[0],xyz[1],xyz[2]));
    }
}
