 //construct a linked list and return only those nodes whose value is even. and delete it also.
public class sll {
   class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
   }
        Node head=null;
        public void add(int data){
            Node currNode=new Node(data);
        if(head==null){
            head=currNode;
            return;
        } 
        currNode.next=head;
        head=currNode;  
        }
        public  void search(){
            Node temp=head;
            if(head==null){
                return;
            }
            while(temp!=null ){
                int data=temp.data;
                if(data%2==0){
                    System.out.println(data);
                }
                temp=temp.next;
            }
        }
        public void searchdelete(){
            Node temp=head;
            Node prev=null;
            if(head==null){
                return;
            }
            while(temp!=null ){
                int data=temp.data;
                if(data%2==0){
                   if(prev!=null){
                    prev.next=temp.next;
                   }
                   else{
                    head=temp.next;
                   }
                }
                else{
                    prev=temp;
                }
                temp=temp.next;
            } 
        }
        void display(){
             Node temp=head;
            if(head==null){
                return;
            }
            while(temp!=null ){ 
                System.out.print(temp.data+"-> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    public static void main(String[] args) {
        sll l=new sll();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        //l.search();
        System.out.println("Before deletion");
        l.display();
        l.searchdelete();
        System.out.println("after deletion");
        l.display();
    }
}
