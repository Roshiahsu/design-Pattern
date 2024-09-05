package org.example.designPattern.memento.tesxtSample.memento;

/**
 * Memento
 */
public class TextMemento {
    private String text;

    /**
     * 構造方法
     * @param text
     */
    public TextMemento (String text) {
        this.text = text;
    }

    /**
     * get方法
     * @return
     */
    public String getText() {
        return this.text;
    }
}
