public class CQueue {
int size = 5; int front , rear ; int item[] = new int [size];
CQueue() {
    front = -1 ; rear=-1;
}
boolean isFull() {
    if(front ==0 && rear ==size-1) {
        return true;
    }return false;
}
boolean isEmpty() {
    if(front ==-1) {
        return true;
    }
            return false;
    
}
void enQueue(int element ) {
    if(isFull()) {
        System.out.println(" It is Full");
    }else {
        if(front ==-1)
            front = 0 ;
        rear =(rear + 1)% size ;
        item[rear]= element ;
        System.out.println(" Insertion "+ element );
    }
}


int deQueue() {
    int element ;
    if(isEmpty()) {System.out.println(" Empty "); return (-1);}else
    {
    element = item[front];
    if(front==rear) {
        front =-1 ; rear = -1 ; 
    }else {
        front=(front +1)%size;
    }return (element);
    }
}

void display() {
    int i ;
    if(isEmpty()) {System.out.println(" Empty Queue ");}
    else {
        System.out.println("Front -> "+front);
        for(i= front ; i!=rear;i=(i+1)%size) {
            System.out.println(item[i]);
            System.out.println(" Rear -> "+rear);
        }
    }
}
public static void main(String[] args) {
        // TODO Auto-generated method stub
CQueue cq = new CQueue();
//fails because front -1 
cq.deQueue();
cq.enQueue(11);cq.enQueue(12);cq.enQueue(13);cq.enQueue(15);cq.enQueue(20);
cq.enQueue(80);//fails to enqueue because front ==0 && rear ==size-1
cq.display();
int elem = cq.deQueue();
if(elem != -1) {
    System.out.println("delete element "+elem);
}cq.display();
cq.enQueue(70);
cq.display();
cq.enQueue(100);
//cq.deQueue();
cq.display();
    }
}
