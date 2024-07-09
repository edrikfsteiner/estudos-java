package javaFunctions.linkedList;

public class linkedList {
    private Node first;

    class Node {
        double value;
        Node next;

        Node(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

    public void insert(double value) {
        Node newNode = new Node(value);
        newNode.next = this.first;
        this.first = newNode;
    }

    public Node delete() {
        Node temp = this.first;
        this.first = this.first.next;
        return temp;
    }

    public Node deleteAny(double value) {
        Node cur = this.first;
        Node prev = this.first;

        while (cur.value != value) {
            if (cur.next == null) return null;
            else {
                prev = cur;
                cur = cur.next;
            }
        }

        if (cur == this.first) {
            this.first = this.first.next;
        } else {
            prev.next = cur.next;
        }

        return cur;
    }

    public void display() {
        Node cur = this.first;

        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.next;
        }
    }

    public Node search(double value) {
        Node cur = this.first;

        while (cur.value != value) {
            if (cur.next == null) return null;
            else {
                cur = cur.next;
            }
        }

        return cur;
    }
}