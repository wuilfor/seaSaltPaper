package org.wuilfor.seasaltpaper

class Game {
    static final int MAX_NUMBER_PLAYERS = 4
    static final int MIN_NUMBER_PLAYERS = 2

    Deck deck
    Stack<Card> discardPile1
    Stack<Card> discardPile2
    List<Player> players

    int currentPlayer

    private Game(List<Player> players) {
        deck = DeckBuilder.build()
        discardPile1 = Stack.of(deck.pop())
        discardPile2 = Stack.of(deck.pop())
        this.players = players
    }

    static Game createNewGame(List<Player> players) {
        if (players.size() >= MIN_NUMBER_PLAYERS && players.size() <= MAX_NUMBER_PLAYERS) {
            throw new Exception("Players must be between ${MIN_NUMBER_PLAYERS} and ${MAX_NUMBER_PLAYERS}")
        }
        return Game(players)
    }

    void start() {
        currentPlayer = new Random().nextInt(players.size()-1)
        players.get(currentPlayer).playTurn(this)
    }

    void triggerNextTurn() {
        //TODO
    }

    void addToDiscardPile(Card card) {
        if (discardPile1.isEmpty()) {
            discardPile1.push(card)
        } else if (discardPile2.isEmpty()) {
            discardPile2.push(card)
        } else {
            int discardPileSelected = new Random().nextInt(1)
            if (discardPileSelected == 0) {
                discardPile1.push(card)
            } else {
                discardPile2.push(card)
            }
        }
    }

    Card getFromDiscardPile() {
        if (discardPilesAreEmpty()) {
            return null
        }
        Card card
        if (discardPile1.isEmpty()) {
            card = discardPile2.pop()
        } else if (discardPile2.isEmpty()) {
            card = discardPile1.pop()
        } else {
            int discardPileSelected = new Random().nextInt(1)
            if (discardPileSelected == 0) {
                card = discardPile1.pop()
            } else {
                card = discardPile2.pop()
            }
        }
        return card
    }

    boolean discardPilesAreEmpty() {
        return discardPile1.isEmpty() && discardPile2.isEmpty()
    }
}
