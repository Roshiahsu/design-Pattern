package org.example.designPattern.memento;

public class GameCaretaker {
    private GameMemento mMemento;

    public GameMemento getMemento()
    {
        return mMemento;
    }

    public void setMemento(GameMemento memento)
    {
        mMemento = memento;
    }
}
