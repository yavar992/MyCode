package oops.a.oops3;

 public class  boxweight extends inheritence {
    int weight;

     public boxweight(double l, double h, double w, int weight) {
        super(l, h, w);// if the super (or this superkeyword) is not executed then the defaul one will be called

         this.weight = weight;

     }
        void fun(){
            System.out.println("doing code is fun");
        }
     boxweight(){
        this.weight = -1;
    }

    public static void main(String[] args) {
        boxweight box1 = new boxweight();
        System.out.println(box1.weight + " " + box1.w);
        box1.working();
        boxweight box2 = new boxweight(2,3,4,5);
        System.out.println(box2.w);
        System.out.println(box2.weight);
        box2.fun();
    }
}
