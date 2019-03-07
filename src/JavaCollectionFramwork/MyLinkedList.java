package JavaCollectionFramwork;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;


    public  MyLinkedList(){
    }

//Tạo lớp class Node
    public class Node{
        private Node next;
        private  Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }


    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        if (index==0){addFirst(element);}
        else {
            if(index>=numNodes){addLast(element);}
            else {
                for(int i=1; i < index-1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                holder = temp.next;
                temp.next = new Node(element);   ////????
                (temp.next).next = holder;
                numNodes++;
            }
        }
    }

    public  void  addFirst(E e){
        Node newNode = new Node(e);
        newNode.next= head;
        head = newNode;
        numNodes++;
    }
   /* public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }*/
   public void  addLast(E e) {
        Node temp = head;
        Node holder ;
        while (temp.next!=null){
         temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);   ////????
        (temp.next).next = holder;
        numNodes++;
    }
    public  E removeFirst(){
       if(numNodes==0){return null;}
       else {
           Node temp = head;
           head = head.next;
           numNodes--;
           if(head==null);
           return (E) temp;

       }
    }
    public E remove(int index){
        Node holder =head;
       if(index<=0){removeFirst();}
       else{
           if (index>=numNodes){
               removeLast();
           }
           else{
               Node temp = head;
               int i=0;
               while (i<index-1){
                   temp= temp.next;
                   i++;
               }
                holder = temp.next;
               temp.next= temp.next.next;numNodes--;

           }
       }
        return (E) holder;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public E removeLast(){
       if(numNodes==0){return null;}
       else{
           if (numNodes==1){
               Node temp = head;
               head = null;
               numNodes=0;
               return (E) temp;
           }
           else {
               Node temp=head;
               int i=0;
               while ( i<numNodes-2){
                   temp= temp.next;
                   i++;
               }
               temp.next= null;
               numNodes--;
               return (E) temp;
           }
       }
    }
   /* E remove(int index){
        if (index ==0)addFirst();
     return ;
    }*/
    public Node get(int index){
        Node temp = head;              ////???
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
