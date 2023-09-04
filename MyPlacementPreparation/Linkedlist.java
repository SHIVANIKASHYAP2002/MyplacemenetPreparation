public class Linkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    void add(int data){
        Node currNode=new Node(data);
        if(head==null){
            head=currNode;
            return;
        } 
        currNode.next=head;
        head=currNode;   
        
    }
    void addlast(int data){
         Node currNode=new Node(data);
        if(head==null){
            head=currNode;
            return;
        } 
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=currNode;
        currNode.next=null;
    }
    void deletefirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    void deletelast(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    void print(){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
        

    }
    static Node reverse(Node head){
        Node temp=null;
        Node next=null;
        while(head!=null){
            next=head.next;
            head.next=temp;
            temp=head;
            head=next;
            
        }
       
        return temp;
    }
    public static void main(String[] args) {
        Linkedlist obj=new Linkedlist();
        // obj.add(10);
        // obj.add(9);
        // obj.add(8);
        // obj.add(7);
        obj.addlast(1);
        obj.addlast(2);
        obj.addlast(3);
         obj.addlast(4);
        obj.addlast(5);
        obj.addlast(6);
        // obj.deletefirst();
        // obj.deletelast();
        // obj.deletefirst();
        // obj.deletelast();
        // obj.deletefirst();
        // obj.deletelast();
        // obj.deletefirst();
        obj.print();
        head=reverse(head);
        obj.print();   
    }
}

