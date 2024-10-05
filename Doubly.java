public class Doubly {

    public static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

    }

    public static void disply(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void rev(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
    }

    public static void show(Node Random) {
        Node temp = Random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insertion At Head
    public static Node insertAtHead(Node head, int data) {
        Node t = new Node(data);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    // Insertion At tail
    public static void insertAtEnd(Node head, int data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(data);
        temp.next = t;
        t.prev = temp;
    }

    // Insertion At Index

    public static void insertAtMiddle(Node head, int idx, int data) {
        Node temp = head;
        int i =1;
     while(i<idx-1){
        temp=temp.next;
        i++;
     }
                Node t = new Node(data);
                temp.next.prev=t;
                t.prev=temp;
                t.next=temp.next;
                temp.next=t;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(1);
        Node e = new Node(9);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        disply(a);
        // rev(e);
        // show(d);
        Node newNode = insertAtHead(a, 3);
        disply(newNode);
        insertAtEnd(e, 13);
        disply(newNode);

        insertAtMiddle(a,3,8);
        disply(newNode);
    }

}
