package ClassAndObject;
class Person {

    public Person() {
        System.out.println("Person performing its tasks!");
    }

    public void display() {
        System.out.println("toi la 1 person");
    }

}
class Employee extends Person {
    public Employee() {
        this("Employee overloading its tasks");
        System.out.println("Employee performing its tasks!");
    }

    public Employee(String s) {
        System.out.println(s);
    }
    public  void work(){
        System.out.println(" make form");
    }

    @Override
    public void display() {
        System.out.println("abc");
        super.display();

    }
}

    class Faculty extends Employee {
        public Faculty() {

            System.out.println("Faculty performing its tasks");
        }

        public static void main(String[] args) {
            Faculty a = new Faculty();
            a.display();
            a.work();

        }
    }




