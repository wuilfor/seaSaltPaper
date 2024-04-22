package org.wuilfor.seasaltpaper

class Main {

    static void main(Object[] args) {
        Player player1 = new Player(name: "Player1")
        Player player2 = new Player(name: "Player2")
        Player player3 = new Player(name: "Player3")
        Player player4 = new Player(name: "Player4")
        Game game = Game.createNewGame([player1, player2, player3, player4])
        game.start()
    }
}
