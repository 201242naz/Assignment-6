package kz.aitu.oop.practice.assignment6.factory.dialog;

import kz.aitu.oop.practice.assignment6.factory.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}