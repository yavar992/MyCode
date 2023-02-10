package oops.a.oops6;

import java.util.ArrayList;
import java.util.Arrays;

public class own_arraylist {
    private int[] data;
    private int size = 0;
    private static   int  DEFAULT_VALUE = 10;
    public  own_arraylist(){

        this.data = new int[DEFAULT_VALUE];
    }
  public void add(int num){
        if (isFll()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
        for (int i = 0; i <data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFll() {
       return size == data.length;
    }
 public int removed(){
        int removed  = data[--size];
        return removed;
 }
 public int getindex(int index){
        return data[index];
 }
 public void set(int index , int value){
        data[index] = value;
 }

    @Override
    public String toString() {
        return "own_arraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ArrayList list2  =  new ArrayList();
        own_arraylist list3 = new own_arraylist();
        list3.add(23);
        list3.add(344);
        list3.add(54);
        list3.add(55);
        list3.set(2,34);
        list3.getindex(1);
      //  list3.isFll();
        System.out.println(list3);
        for (int i = 1; i <14 ; i++) {
            list3.add(2*i);
        }
        System.out.println(list3);
        list3.removed();
        System.out.println(list3);
    }
}
