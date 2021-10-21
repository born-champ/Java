import java.util.*;


public class MainLinkList {
public Node head = null ;
class Node {
    private int data ; private Node next;
    public Node(int data) {
        super();
        this.data = data;
    }
}
public void addNodeAtTheBeginning(int data) {
    System.out.println("Add a node ");
    Node newNode = new Node(data);
    if(this.head == null ) {
        this.head = newNode;
    }else {
        newNode.next=this.head;
        this.head = newNode;
    }
}

public void deleteFirstOccurenceOfData(int data) {
    System.out.println(" delete data ");
    if(this.head ==null) {
        System.out.println(" empty");return;
    }
    Node cur = this.head , prev = this.head;
    if(this.head.data ==data) {
        this.head = this.head.next;return;
    }while(cur!=null && cur.data!=data) {
        prev = cur ;
        cur = cur.next;
    }
}

public void addNodeAtTheEnd(int data) {
    System.out.println(" add node at the end");
    Node newNode = new Node(data);
    if(this.head==null) {
        this.head = newNode;
        
    }else {
        Node cur = this.head;
        while(cur.next!=null) {
            cur=cur.next;
            
        }cur.next=newNode;
    }
}

public void print() {
    if(this.head==null) {
        System.out.println("List is empty");
    }else {
        System.out.println(" The contents of the list are :");
        Node cur= this.head;
        while(cur!= null) {
            System.out.println(cur.data+"  ");
            cur=cur.next;
        }
    }
}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
MainLinkList list = new MainLinkList();
list.print();
list.addNodeAtTheBeginning(100);
list.print();
list.addNodeAtTheBeginning(300);
list.print();
list.addNodeAtTheBeginning(400);
list.print();
list.deleteFirstOccurenceOfData(300);
list.print();
list.addNodeAtTheEnd(700);
list.print();
    }
}