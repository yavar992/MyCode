package testing;

public class automobile {
    private String drive() {
        return "Driving vehicle";
    }
}
class car extends automobile{
    protected String drive() {
        return "Driving car";
    }
}
