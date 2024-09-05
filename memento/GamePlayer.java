package org.example.designPattern.memento;

import lombok.ToString;

@ToString
public class GamePlayer {
    private int hp;
    private int exp;

    public GamePlayer(int hp, int exp) {
        this.hp = hp;
        this.exp = exp;
    }

   public GameMemento save() {
        return new GameMemento(hp, exp);
   }

   public void load(GameMemento gameMemento) {
        hp = gameMemento.getHp();
        exp = gameMemento.getExp();
   }

   public void die() {
        hp = 0;
   }
}
