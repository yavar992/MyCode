package oops.a.Linkedlist;

public class linkedlist {
  private node head;
   private node tail;
   private int size;

   linkedlist(){
       this.size=0;
   }

    public void insertfirst(int val){
       node node = new node(val);
        if (head==tail){
            tail=head;
            return;
        }
       node.next =head;
       head = node;
       size++;

    }
    private class node{
        private int value;
        private node next;
        node(int value){

            this.value = value;
        }

        public node(int value, linkedlist.node node) {
            this.value = value;
            this.next = node;
        }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertfirst(12);
        list.insertfirst(32);
    }
}
