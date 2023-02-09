package Seminars.HW2;

import java.util.Iterator;

public class MyLinkedList implements Iterable<Integer> {
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addFirst(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void removeFirst () {
        head = head.next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                Integer data  = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public void reverse () {
        if (!isEmpty() && head.next != null) {
            Node current = head.next;
            head.next = null;

            while (current != null) {
                Node next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
    }
}
