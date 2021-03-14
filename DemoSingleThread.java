package kz.aitu.oop.practice.assignment6.singleton;

public class DemoSingleThread {
    public static void main() {
        System.out.println("If you see the same value, then singleton was reused (good!)" + "\n" +
                "If you see different values, then 2 singletons were created (bad!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
