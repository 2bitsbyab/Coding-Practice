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
        //special case
        if(head.data == data){
            head = head.next;
            return;
        }
        Node prev = head;
        Node current = head.next;
        while(current != null){
            if(current.data == data){
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }
    
    }

    public void reverse(){
        if(head == null)
            return;
        Node prev = null;
        Node current = head;
        while(current.next != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next = prev;
        head = current;
    }
    //reverse first k nodes
    public void kReverse(int k){
        if(head == null || k == 1)
            return;
        Node prev = null;
        Node current = head;
        int cnt = 1;
        while(current.next != null && cnt < k){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            cnt++;
        }
        head.next = current.next;
        current.next = prev;
        head = current;     
    }
    public static Node midNode(Node h ){
        if(h == null){
            return null;
        }
        Node slow = h;
        Node fast = h.next;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static Node merge(Node l, Node r){
        if(l == null) return r;
        if(r == null) return l;
        Node c =  null;
        if(l.data < r.data){
            c = l;
            c.next = merge(l.next, r);
        }else{
           c = r; 
           c.next = merge(l, r.next);
        }
        return c;
    }
    public static Node mergeSort(Node h){
        if(h == null)return null;
        if(h.next == null) return h;
        Node mid = midNode(h);
        Node right = mid.next;
        mid.next = null;
        Node l = mergeSort(h);
        Node r = mergeSort(right);
        return merge(l, r);
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        // ll.print();
        // ll.insert(1);
        // ll.print();
        // ll.insert(3);
        // ll.insert(2);
        // ll.print();
        // ll.delete(3);
        // ll.print();
        // ll.delete(2);
        // ll.print();
        // ll.insert(5);
        // ll.print();
        // ll.delete(1);
        // ll.print();
        // ll.delete(5);
        // ll.print();
        ll.insert(1);
        ll.insert(13);
        ll.insert(12);
        ll.insert(15);
        ll.insert(14);
        ll.insert(17);
        ll.print();
        //ll.reverse();
        ll.head = LinkedList.mergeSort(ll.head);
        ll.print();
        // ll.kReverse(5);
        // ll.print();
        // ll.delete(1);
        // ll.print();
        // ll.delete(13);
        // ll.print();
        // ll.delete(15);
        // ll.print();
        // ll.delete(10);
        // ll.print();
    }
}