package oops.a.oops6;

public interface last  {
    String name(String name);
}
class lastexaple{
    last l = (name -> {
        return "hello"+name;
    });
}

