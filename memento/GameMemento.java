package org.example.designPattern.memento;

public class GameMemento {
    private int hp;
    private int exp;

    public GameMemento(int hp, int exp) {
        this.hp = hp;
        this.exp = exp;
    }

    public int getHp() {
        return hp;
    }
    public int getExp() {
        return exp;
    }
}
