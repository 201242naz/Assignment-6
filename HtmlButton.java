package kz.aitu.oop.practice.assignment6.factory.button;

import kz.aitu.oop.practice.assignment6.factory.button.Button;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
