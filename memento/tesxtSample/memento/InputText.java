package org.example.designPattern.memento.tesxtSample.memento;

/**
 * Originator
 */
public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    public TextMemento createTextMemento() {
        return new TextMemento(text.toString());
    }

    public void restore(TextMemento textMemento) {
        this.text.replace(0, this.text.length(), textMemento.getText());
    }
}
