package Seminars.HW2;

import java.util.Iterator;

public class MyLinkedList implements Iterable<Integer> {
    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
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
        if (isEmpty()) {
            tail = temp;
        } else {
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }

    public void removeFirst () {
        Node temp = head;
        if (head.next == null) {
            tail = null;
        } else {
            head.next.prev = null;
        }
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
            tail = head;
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
