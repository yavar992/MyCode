package Advanced_java.collection.list.linkedlist;

import javax.xml.parsers.SAXParser;

public class LL {
    class Node{
        String data;
        Node next;
        Node head;

        Node(String data){
            this.data = data;
            this.next= null;
        }
        void InsertFirst(String val){
            Node node = new Node(val);
            if (head == null){
                head = node;
            }

        }


    }

    public static void main(String[] args) {

    }
}
