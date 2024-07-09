package javaFunctions.doublyLinkedList;

public class doublyLinkedList {
    private Node first;
    private Node last;

    class Node {
        double value;
        Node next;
        Node prev;

        Node(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }
    
    public void insertStart(double value) {
        Node newNode = new Node(value);
        
        if (this.first == null) {
            this.last = newNode;
        } else {
            this.first.prev = newNode;
        }

        newNode.next = this.first;
        this.first = newNode;
    }

    public void insertEnd(double value) {
        Node newNode = new Node(value);
        
        if (this.first == null) {
            this.first = newNode;
        } else {
            this.last.next = newNode;
            newNode.prev = this.last;
        }

        this.last = newNode;
    }


    public Node deleteStart() {
        Node temp = this.first;

        if (this.first != null) {
            if (this.first.next == null) {
                this.last = null;
            } else {
                this.first.next.prev = null;
            }

            this.first = this.first.next;
        }

        return temp;
    }

    public Node deleteEnd() {
        Node temp = this.last;

        if (this.last != null) {
            if (this.last.prev == null) {
                this.first = null;
            } else {
                this.last.prev.next = null;
            }

            this.last = this.last.prev;
        }

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

    public void displayStart() {
        Node cur = this.first;

        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.next;
        }
    }

    public void displayEnd() {
        Node cur = this.last;

        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.prev;
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