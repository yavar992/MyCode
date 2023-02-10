package oops.a.oop7;

public class enums {
    enum  weeks implements hello{
        Sunday , Monday ,  Tuesday , Wednesday , Thursday , Friday , Sturday;
        //  these r enum constant
        // these are public , static , final by default
        // since it is final we cannot make the  child enum because as we know final prevent inheritence
         weeks(){
            System.out.println("constructor is called for " + this);
        }

        @Override
        public void hi() {
            System.out.println("hi how r u");
        }
    }

    public static void main(String[] args) {
        weeks Day;
        Day = weeks.Friday;
        Day = weeks.Monday;
        Day.hi();
        Day = weeks.Monday;

//        for(weeks days : weeks.values()){
//            System.out.println(days);
//        }

    }
}
