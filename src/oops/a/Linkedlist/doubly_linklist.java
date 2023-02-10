package oops.a.Linkedlist;

import java.util.List;

public class doubly_linklist {
  private Node head;
    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.pre = null;
        if (head != null) {
            head.pre = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while (node!=null){
            System.out.print(node.value + " - >");
               // last = null;
            node = node.next;
        }

        System.out.println("END");
    }


       private   class Node{
             int value;
             Node next;
             Node pre;
             public Node(int value){
                 this.value = value;
             }


           public Node(int value, Node next, Node previous) {
               this.value = value;
               this.next = next;
               this.pre = previous;
           }
       }

    public static void main(String[] args) {
        doubly_linklist list1 = new doubly_linklist();
        list1.InsertFirst(12);
        list1.InsertFirst(23);
        list1.InsertFirst(43);
        list1.InsertFirst(54);
        list1.display();
    }
    }

