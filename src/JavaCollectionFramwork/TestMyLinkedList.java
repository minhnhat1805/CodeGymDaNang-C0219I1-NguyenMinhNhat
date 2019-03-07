package JavaCollectionFramwork;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(11);
        ll.addFirst(123);
        ll.add(1,12);
        ll.addLast(33);
        ll.addLast(111);
        ll.add(4,9999);
        ll.printList();
        System.out.println();
        System.out.println(ll.getNumNodes());
        ll.removeFirst();
        System.out.println(ll.getNumNodes());
        ll.printList();
        System.out.println();
        ll.removeLast();
        System.out.println(ll.getNumNodes());
        ll.printList();
        System.out.println();
        ll.remove(2);
        ll.printList();

       // System.out.println( ll.remove(1));
    }
}
