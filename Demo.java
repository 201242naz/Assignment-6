package kz.aitu.oop.practice.assignment6.factory;

import kz.aitu.oop.practice.assignment6.factory.dialog.Dialog;
import kz.aitu.oop.practice.assignment6.factory.dialog.HtmlDialog;
import kz.aitu.oop.practice.assignment6.factory.dialog.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main() {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}