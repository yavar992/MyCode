package oops.a.inheritence;

public class innerclass {
  static class test{
       public test(String name) {
            this.name = name;
        }

        String name;

      @Override
      public String toString() {
          return name;
      }
  }


    public static void main(String[] args) {
        test a = new test("yavar ali khan");
        test b = new test("anas");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
        human ad = new human(12,"helllo",22222,true);
        System.out.println(ad.age);
    }
}
