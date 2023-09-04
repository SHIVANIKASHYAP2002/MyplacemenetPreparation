public class StackLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    void push(int data){
        Node newnode=new Node(data);
        if(top==null){
            top=newnode;
            return;
        }
        newnode.next=top;
        top=newnode;  
    }
    int  pop(){
        if(top==null){
            System.out.println("List is empty");
            return -1;
        }
        int data=top.data;
        top=top.next;
        return data;
    }
    int peek(){
         if(top==null){
            System.out.println("List is empty");
            return -1;
        }
        int data=top.data;
        return data;
    }
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    void display(){
        if(top==null){
            System.out.println("List is empty");
            return ;
        }
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        StackLL sll=new StackLL();
       sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
        sll.push(5);
        sll.push(6);
        sll.push(7);
       // sll.display();
        
        System.out.println(sll.pop());
    }
}
