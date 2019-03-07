package JavaCollectionFramwork;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList(6);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 11);
        System.out.println(list.remove(1));
    }

    }
