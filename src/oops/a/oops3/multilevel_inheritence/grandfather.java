package oops.a.oops3.multilevel_inheritence;

import com.sun.source.doctree.SeeTree;

public class  grandfather {
    String name;
    grandfather(){

    }
    public grandfather(String name) {
        this.name = name;
    }
    void five_bhk_house(){
        System.out.println(name + " have 5 bhk flat");
    }
}
class father extends grandfather{
    String name;
    father(){

    }

    public father(String name) {
        this.name = name;
    }
    void five_acre(){
        System.out.println(name + " have 5 acre of land");
    }
}
class son extends father{
    String name;
    son(){

    }

    public son(String name) {
        this.name = name;
    }
    void audi()
    {
        System.out.println(name + "have an audi car");
    }

    public static void main(String[] args) {
        grandfather rakesh = new grandfather();
        rakesh.name = "rakesh";
        father sudheer = new father();
        sudheer.name = "sudheer";
        son ameerbaapkiaulad = new son();
        ameerbaapkiaulad.name = "rahul";
        ameerbaapkiaulad.audi();
        sudheer.five_acre();
        rakesh.five_bhk_house();

    }
}
