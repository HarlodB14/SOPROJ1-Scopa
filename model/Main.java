package model;

import model.Card;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(1, "Mar!n", "yallah" );
        Player player2 = new Player(2, "Tholo", "yallah" );
        Game scopa = new Game(1, player2);
        scopa.play(player1);
    }


}
