package org.example.designPattern.memento.tesxtSample.memento;

import java.util.Stack;

/**
 * Caretaker
 */
public class TextCaretaker {
    /**
     * 儲存容器
     */
    private Stack<TextMemento> textMementos = new Stack<>();

    /**
     * 獲取最後的紀錄
     * @return
     */
    public TextMemento popTextMemento() {
        return textMementos.pop();
    }

    /**
     * 儲存
     * @param textMemento
     */
    public void pushTextMemento(TextMemento textMemento) {
        textMementos.push(textMemento);
    }
}
