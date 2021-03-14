package kz.aitu.oop.practice.assignment6;

import kz.aitu.oop.practice.assignment6.builder.DemoBuilder;
import kz.aitu.oop.practice.assignment6.factory.Demo;
import kz.aitu.oop.practice.assignment6.singleton.DemoSingleThread;

public class Main {

    public static void main(String[] args) {
        DemoSingleThread.main();
        System.out.println("****************************************************");
        Demo.main();
        System.out.println("****************************************************");
        DemoBuilder.main();
    }
}
