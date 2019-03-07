package JavaCollectionFramwork;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public  MyList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
    void add(int index, E element) {
        size= elements.length;
        int newSize= size++;
        Object[] newArray = new Object[newSize];
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("index "+index+" wrong");
        }else {

            for (int i=0;i<index;i++) {
                newArray[i] = elements[i];
                System.out.println(newArray[i]);
            }
            newArray[index]= element;
            System.out.println(newArray[index]);
            for (int i=index+1;i<size;i++) {
                newArray[i] = elements[i-1];
                System.out.println(newArray[i]);
            }
        }

    }
    Object[] remove(int index){
        size= elements.length;
        int newSize= size--;
        Object[] newArray = new Object[newSize];
        if (index<0||index>=size){

        }else {

            for (int i=0;i<index;i++) {
                newArray[i] = elements[i];
            }

            for (int j=index;j<size-1;j++){
                newArray[j]= elements[j+1];
            }
        }
        return newArray;
    }
    int indexOf(E o){
        for (int i=0;i<size;i++){
            if (elements[i]==o){
                return i;
            }
        }
        return -1;

    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}






/* public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;
    private Object elements[];

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    void add(int index, E element) {
     if (index<0||index>=size){
         throw new IndexOutOfBoundsException("index "+index+"Ilvalid!");
     }else {
         int newSize= size++;
         Object[] newArray = new Object[newSize];
         for (int i=0;i<index;i++) {
             newArray[i] = elements[i];
         }
         newArray[index]= element;
         for (int i=index+1;i<size;i++) {
             newArray[i] = elements[i];
         }
     }
    }
    E remove(int index){
        int newSize= size--;
        Object[] newArray = new Object[newSize];
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("index "+index+"Ilvalid!");
        }else {

            for (int i=0;i<index;i++) {
                newArray[i] = elements[i];
            }

            for (int j=index;j<size-1;j++){
                newArray[j]= elements[j+1];
            }
        }
        return (E) newArray;
        }
      int size(){
        return this.size;
      }
      protected E clone(){
        Object[] cloneArray ;
        cloneArray = elements.clone();
        return (E) cloneArray;
      }
      boolean contains(E o){
       for (int i=0 ; i<size;i++){
           if (elements[i]==o){
               return true;
           }

       }
       return false;
      }
      int indexOf(E o){
        for (int i=0;i<size;i++){
            if (elements[i]==o){
                return i;
            }
        }
          return -1;

      }
      void print(){
        for(Object e:elements){
            System.out.println(e);
        }
      }
      boolean add(E e){
        int newSize= size ++;
        Object[] newArray = new Object[newSize];
        newArray[newArray.length]= e;
        for (int i =0 ; i<size;i++){
            newArray[i]= elements[i];
        }
        return true;
      }
      void ensureCapacity(int minCapacity){
         Object[] newArr= new Object[minCapacity];
         int i = 0;
         while (i<minCapacity){
             newArr[i]= elements[i];
             i++;
         }
      }
      E get(int i){
        return (E) elements[i];
      }
      void clear(){

      for (Object element :elements){
          element = null;
          System.out.println( element);
      }

      }

    }
*/