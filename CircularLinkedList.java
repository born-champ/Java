public class CircularLinkedList {
static class Node{
    int data ;
    Node next;
};
static Node addToEmpty(Node last , int data) {
    if(last!=null)
        return last;
    Node newNode = new Node();
    newNode.data = data ;
    last=newNode;
    newNode.next=last;
    return last;
}

static Node  addEnd(Node last , int data ) {
    if(last == null)
        return addToEmpty(last , data);
     Node newNode = new Node();
     newNode.data=data;
     newNode.next = last.next;
     last.next=newNode;
     last= newNode;
    return last;
}
static Node addFront(Node last , int data ) {
    if(last==null)
        return addToEmpty(last , data );
      Node newNode = new Node();
      newNode.data =data;
      newNode.next=last.next;
      last.next=newNode;
      
    return last;
    
}

static void traverse(Node last) {
    Node p ;
    if(last == null)
    {
        System.out.println(" empty");return ;
    }
    p=last.next;
    do {
        System.out.println(p.data +"  ");
        p=p.next;
    }while(p!=last.next);
}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       Node  last = null ; 
       last = addToEmpty(last, 6 );
       last = addEnd(last, 8 );
       last = addFront(last, 2 );
       traverse(last);
      // deleteNode();
    }
}

