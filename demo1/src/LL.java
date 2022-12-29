 // Implement LinkList without using  collection framework
//public class LL {
//
//    Node head;
//    private int size;
//
//    LL() {
//        size = 0;
//    }
//
//    public class Node {
//        String data;
//        Node next;
//
//        Node(String data) {
//            this.data = data;
//            this.next = null;
//            size++;
//        }
//    }
//
//    public void addFirst(String data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void addLast(String data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node lastNode = head;
//        while (lastNode.next != null) {
//            lastNode = lastNode.next;
//        }
//
//        lastNode.next = newNode;
//    }
//
//    public void printList() {
//        Node currNode = head;
//
//        while (currNode != null) {
//            System.out.print(currNode.data + " -> ");
//            currNode = currNode.next;
//        }
//
//        System.out.println("null");
//    }
//
//    public void removeFirst() {
//        if (head == null) {
//            System.out.println("Empty List, nothing to delete");
//            return;
//        }
//
//        head = this.head.next;
//        size--;
//    }
//
//    public void removeLast() {
//        if (head == null) {
//            System.out.println("Empty List, nothing to delete");
//            return;
//        }
//
//        size--;
//        if (head.next == null) {
//            head = null;
//            return;
//        }
//
//        Node currNode = head;
//        Node lastNode = head.next;
//        while (lastNode.next != null) {
//            currNode = currNode.next;
//            lastNode = lastNode.next;
//        }
//
//        currNode.next = null;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//
//    public static void main(String args[]) {
//        LL list = new LL();
//        list.addLast("is");
//        list.addLast("a");
//        list.addLast("list");
//        list.printList();
//
//        list.addFirst("this");
//        list.printList();
//        System.out.println(list.getSize());
//
//        System.out.println("Print Link List");
//        list.removeFirst();
//        list.printList();
//
//        list.removeLast();
//        list.printList();
//    }
//}


 // Implement LinkList using collection framework
import java.util.*;

 class LL {
     public static void main(String args[]) {
         LinkedList<String> list = new LinkedList<String>();

         list.addFirst("shradha");
         list.addFirst("name");
         list.addFirst("my");
         System.out.println(list);
         for(int i=0;i< list.size();i++){
             System.out.print(list.get(i) + "-->");
         }


         list.add(2, "is");
         System.out.println(list);
     }
 }


