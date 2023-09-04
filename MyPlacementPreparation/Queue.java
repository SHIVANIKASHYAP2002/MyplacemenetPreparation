public class Queue {
    int front=-1,rear=-1;
    int n=10;
    int arr[]=new int[n];
    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full so  "+data+" can not insert in the queue");
            return;
        }
        else if(isEmpty()){
            rear++;
            front++;
            arr[rear]=data;
            return;
        }
        rear++;
        arr[rear]=data;

    }
    int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int data=arr[front];
        front++;
        return data;
    }
    int peek(){
         if(isEmpty()){
            return -1;
        }
        int data=arr[front];
        return data;
    }
    boolean isEmpty(){
        if(rear==-1 && front==-1 ){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(front>rear || rear>=n-1){
            return true;
        }
        return false;
    }
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
public static void main(String[] args) {
    Queue q=new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.enqueue(6);
    q.enqueue(7);
    q.enqueue(8);
    q.enqueue(9);
    q.enqueue(10);
    q.display();
    q.enqueue(11);
    System.out.println(q.dequeue());
    System.out.println(q.peek());
}
}
