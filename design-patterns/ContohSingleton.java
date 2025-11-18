public class ContohSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.createSingleton();

        s.setValue("data1");

        System.out.println("s: " + s.getValue());

        Singleton s1 = Singleton.createSingleton();
        s1.getValue();
        System.out.println("s1: " + s1.getValue());
        s1.setValue("object 2");
        System.out.println("s: " + s.getValue());
        System.out.println("s1: " + s1.getValue());
    }
}

class Singleton {
    String value;
    private static Singleton instance;

    private Singleton() {
    }

    // singleton method yang membuat singleton
    public static Singleton createSingleton() {
        if (instance != null) {
            return instance;
        }

        instance = new Singleton();
        return instance;
    }

    public String getValue() {
        return instance.value;
    }

    public void setValue(String value) {
        instance.value = value;
    }
}
