package org.example.designPattern.memento.tesxtSample.memento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        TextCaretaker textCaretaker = new TextCaretaker();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String text = in.next();
            if (":exit".equals(text)) {
                break;
            }
            if ((":list").equals(text)) {
                System.out.println(inputText.getText());
            } else if ((":undo").equals(text)) {
                TextMemento textMemento = textCaretaker.popTextMemento();
                inputText.restore(textMemento);
            } else {
                textCaretaker.pushTextMemento(inputText.createTextMemento());
                inputText.append(text);
            }
        }
    }
}
