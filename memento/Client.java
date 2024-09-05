package org.example.designPattern.memento;

public class Client {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayer(100, 0);

        GameCaretaker gameCaretaker = new GameCaretaker();
        //存檔
        gameCaretaker.setMemento(player.save());
        System.out.println("剛開始" + player);
        player.die();
        System.out.println("死掉惹" + player);
        player.load(gameCaretaker.getMemento());
        System.out.println("S/L大法" + player);

    }
}
