package org.wuilfor.seasaltpaper


import spock.lang.Specification

class PlayerSpecification extends Specification {
    Game game
    Deck deck
    Player player

    def setup() {
        game = Mock(Game)
        deck = Mock(Deck)
        game.deck >> deck
        player = new Player()
    }

    def "player pick from deck when discard piles are empty"() {
        given: "discard piles empty"
          game.discardPilesAreEmpty() >> true
          //game.discardPilesAreEmpty() >>> [true, true, false, true]
        when:
          player.playTurn(game)
        then: "player never touch the discard piles"
          0 * game.getFromDiscardPile()
        and: "player finish his turn"
          1 * game.triggerNextTurn()
        and: "player hand increased"
          player.hand.size() == 1
    }

}