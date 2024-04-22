package org.wuilfor.seasaltpaper

class Main {

    static void main(Object[] args) {
        Player player1 = new Player()
        Player player2 = new Player()
        Player player3 = new Player()
        Player player4 = new Player()
        Game game = Game.createNewGame([player1, player2, player3, player4])
        game.start()
    }
}
