public class li2 {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        node head=null;
        node tail=null;
        void insertatend(int val){
             node temp=new node(val);
             if(head==null){
                head=temp;
                tail=temp;
             }else{
                tail.next=temp;
                tail=temp;
             }
        }
        void insertstart(int val){
            node temp=new node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;


            }

        }
        void insertAt(int idx,int val){
            node t=new node(val);
            node temp=head;
            if(idx==size()){
                insertatend(val);
                return;
            }
            else if(idx==0){
                insertstart(val);
                return;
            }
            else if(idx<0){
                System.out.println("wrong index");
                return;
            }
            else if(idx>size()){
                 System.out.println("wrong index");
                 return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            System.out.println();
        }
        int getAt(int idx){
            node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;

            }
            temp.next=temp.next.next;
        }
        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            node temp=head;
            int count=0;
            while(temp!=null){
                //System.out.println(temp.data+" ");
                count++;
                temp=temp.next;
            }return count;
        }

    }
    public static void main(String[] args) {
       // System.out.println("hi");
        linkedlist l1= new linkedlist();
        l1.insertatend(4);
        //l1.display();
        l1.insertatend(5);
        //l1.display();
        System.out.println();
        System.out.println("size of the linklist is: "+l1.size());
        l1.insertstart(7);
        System.out.println("display element at the starting position");
        //l1.display();
        System.out.println("After inserting index at any ondex and value");
        l1.insertatend(77);
        l1.display();
        System.out.println("after inserting the new element");
        l1.insertAt(3, 99);
        l1.display();
        System.out.println();
        System.out.println(l1.getAt(3));
        l1.deleteAt(1);
        l1.display();
}
}