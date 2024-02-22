                                                         Linked List Using java (Add First)


class Node{

    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }



   void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Main{
    public static void main(String[]args){
        LinkedList l1=new LinkedList();
        l1.addFirst(30);
        l1.addFirst(50);
        l1.addFirst(40);
        l1.addFirst(70);
        l1.print();
    }
}