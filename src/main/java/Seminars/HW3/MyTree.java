package Seminars.HW3;

import java.util.Objects;

public class MyTree<T extends Comparable<T>> {

    private Node root;

    private class Node {
        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }

    public void add(T value) {
        Objects.requireNonNull(value);
        root = appendNode(root, value);
    }

    private Node appendNode(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }

        int compare = value.compareTo(current.value);
        if (compare < 0) {
            current.left = appendNode(current.left, value);
        } else if (compare > 0) {
            current.right = appendNode(current.right, value);
        }

        return current;
    }

    public boolean contains(T value) {
        final Node node = findNode(root, value);
        return node != null;
    }

    private Node findNode(Node node,T value) {
        if (node.value.equals(value)) {
            return node;
        } else {
            int compare = node.value.compareTo(value);
            if (compare > 0) {
                if (node.left != null) {
                    return findNode(node.left, value);
                } else {
                    return null;
                }
            } else {
                if (node.right != null) {
                    return findNode(node.right, value);
                } else {
                    return null;
                }
            }
        }
    }

}
