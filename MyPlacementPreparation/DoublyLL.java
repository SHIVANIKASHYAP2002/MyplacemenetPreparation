public class DoublyLL {
    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            head.prev=null;
            head.next=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        newnode.next=null;
    }
    public void addFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            head.prev=null;
            head.next=null;
            return;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }
    void deletefirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void deletelast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
    }
    void addidx(int data,int indx){
        Node newnode=new Node(data);
        if(indx==0){
            newnode.next=head;
            head=newnode;
            return;
        }
        Node temp=head;
        int c=1;
        while(temp!=null && c<indx){
            System.out.println(temp.data);
            temp=temp.next;
            c++;
        }
        newnode.next=temp.next;
        newnode.prev=temp;
        temp.next=newnode;
    }

    void display(){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        DoublyLL obj=new DoublyLL();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        obj.addLast(6);
        obj.addidx(9, 3);
        // obj.addFirst(7);
        // obj.addFirst(8);
        // obj.addFirst(9);
        // obj.addFirst(10);
        // obj.deletefirst();
        // obj.deletelast();
        obj.display();
    }
}
