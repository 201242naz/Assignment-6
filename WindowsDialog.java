package kz.aitu.oop.practice.assignment6.factory.dialog;

import kz.aitu.oop.practice.assignment6.factory.button.Button;
import kz.aitu.oop.practice.assignment6.factory.button.WindowsButton;
import kz.aitu.oop.practice.assignment6.factory.dialog.Dialog;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}