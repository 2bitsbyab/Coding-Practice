package LinkedList;

public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
    public void print(){
        if(head == null){
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp != null);
        System.out.println();
    }

    public void delete(int data){
        if(head == null){
            return;
        }
        else if(head.data == data){
            head = head.next;
            return;
        }
        Node prev = head;
        Node temp = head;
        do{
            if(temp.data == data){
                prev.next = temp.next;
                //temp is dereferrenced hence will be collected by garbage collector
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.insert(1);
        ll.print();
        ll.insert(3);
        ll.insert(2);
        ll.print();
        ll.delete(3);
        ll.print();
        ll.delete(2);
        ll.print();
        ll.insert(5);
        ll.print();
        ll.delete(1);
        ll.print();
        ll.delete(5);
        ll.print();
    }
}