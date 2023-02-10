package oops.a.oops6;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.nio.channels.FileLock;

public class expirement2 <T> {
    T name;

    public expirement2( T name) {
        this.name = name;
    }

   public void display() {
       System.out.println("the value of the name is :" +name);
   }

    @Override
    public String toString() {
        return name.toString();
    }

    public static void main(String[] args) {
        expirement2<Integer> n1 = new expirement2<>(23);
        expirement2<String> N2 = new expirement2<>("hello");
        expirement2<Float> n3 = new expirement2<Float>(23.434f);
        System.out.println(n1 + " " + N2 + " " + n3);

    }
}
