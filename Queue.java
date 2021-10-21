public class Queue {
    int size = 5; int item [] = new int[size];int front, rear ;
        public Queue() {
        super();
        front = -1;
        rear = -1;
    }
boolean isFull() {
    if(front == 0 && rear ==size -1) {
        return true;
    }return false;
}
boolean isEmpty() {
    if(front ==-1) {
        return true ;
    }
            return false;
    }
    void enQueue(int element ) {
    if(isFull()) {
        System.out.println(" It is full");
    }else {
        if(front == -1 )
            front=0;rear++;
            item[rear]=element;
            System.out.println(" Inserted element "+ element);
    }
}
int deQueue() {
    int element ;
    if(isEmpty()) {
        System.out.println(" Yes it is Empty");
        return (-1);
    }else {
        element = item[front];
        if( front >= rear ) {
            front = -1 ; rear = -1 ;
        }else {
            front++;
        }System.out.println("item deleted : "+ element );
        return (element);
    }
}

void display() {
    int i ; 
    if(isEmpty()) {
        System.out.println(" Empty");
    }else {
        System.out.println(" Front index "+ front );
        System.out.println(" Items " );
        for(i=front ; i<=rear ;i++)
            System.out.println(item[i] +" ");
        System.out.println(" Rear index "+ rear);
    }
}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      Queue q1 = new Queue();
      q1.deQueue();
      q1.enQueue(10);q1.enQueue(20);q1.enQueue(50);q1.display();
      q1.deQueue();q1.display();
      
    }
}