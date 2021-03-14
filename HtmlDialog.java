package kz.aitu.oop.practice.assignment6.factory.dialog;

import kz.aitu.oop.practice.assignment6.factory.button.Button;
import kz.aitu.oop.practice.assignment6.factory.button.HtmlButton;
import kz.aitu.oop.practice.assignment6.factory.dialog.Dialog;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}