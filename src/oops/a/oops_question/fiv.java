package oops.a.oops_question;

abstract public class fiv {
     String title = "hey";
    String getTitle(){
        return title;
    }
    abstract void setTitle(String  s);
}
class abc extends fiv {
    public static void main(String[] args) {
        abc a = new abc();

        a.title = "hello";
        a.setTitle("");
        a.getTitle();
    }

    @Override
    void setTitle(String s) {
        System.out.println("hello");
    }

    @Override
    String getTitle() {
        return super.getTitle();
    }

    class abcde {
        public static void main(String[] args) {
            abc a = new abc();
            // a.setTitle("hello dear");
            a.title = "hey";
            a.getTitle();
            System.out.println(a.getTitle());
        }
    }
}
