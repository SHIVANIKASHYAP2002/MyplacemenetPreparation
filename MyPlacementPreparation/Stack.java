public class Stack {
    int n=15;
    static int top=-1;
    int[] arr=new int[n];
    void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        
        arr[++top]=data;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return-1;
        }
        top--;
        int data=arr[top];
        return data;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return-1;
        }
        
        int data=arr[top];
        return data;
    }
    boolean isFull(){
        if(top>=n-1){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        //s.display();
       System.out.println(s.peek());
       System.out.println(s.pop());
        System.out.println(s.peek());



    }
}
