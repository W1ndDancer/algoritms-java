package Seminars.HW2;

public class Main {

    public static void main(String[] args) {
        MyLinkedList newList = new MyLinkedList();
        newList.addFirst(1);
        newList.addFirst(2);
        newList.addFirst(3);
        newList.addFirst(4);
        newList.addFirst(5);
        newList.print();

        System.out.println();
        newList.removeFirst();
        newList.removeFirst();
        newList.print();

        System.out.println();
        newList.reverse();
        newList.print();
    }
}
