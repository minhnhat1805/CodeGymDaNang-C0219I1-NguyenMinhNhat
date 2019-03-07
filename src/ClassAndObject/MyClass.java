package ClassAndObject;

class MyClass1 {
    void method(int x, int y) {
        x = 5;
        y = 5;

    }

    public static void main(String[] args) {
        MyClass1 o = new MyClass1();
        int x = 1, y = 1;
        o.method(x, y);
        System.out.printf("x=%d, y=%d", x, y);
    }
}
class Class {
    void method(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }

    public static void main(String[] args) {
        Class o = new Class();
        int[] x = {1, 1};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }

}
