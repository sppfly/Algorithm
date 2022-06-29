package misc;

public class Foo {

    static class Helper {
        String a = "helper";
    }


    private static Helper helper;
    public synchronized Helper getHelper() {
        if (helper == null) {
            helper = new Helper();
        }
        return helper;
    }
}
