package Advanced_java.Collections;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(12);
        stk.push(23);
        stk.push(34);
        stk.push(32);
        stk.push(43);
        stk.push(543);
        stk.push(5);
        System.out.println(stk);
        stk.set(5,32);
        stk.pop();
        System.out.println(stk);
        stk.add(9);
        System.out.println(stk);
        stk.elementAt(4);
        System.out.println(stk);
        System.out.println(stk.peek());
    }
}
