package org.wuilfor.seasaltpaper

class Player {
    List<Card> hand = new ArrayList<>()
    List<Card> usedCards = new ArrayList<>()
    String name

    void playTurn(Game game) {
        pickNewCard(game)

        //TODO

        game.triggerNextTurn()
    }

    private void pickNewCard(Game game) {
        PlayerPickAction action
        if (game.discardPilesAreEmpty()) {
            action = new PickFromDeckAction()
        } else {
            int pickAction = new Random().nextInt(1)
            action = pickAction == 0 ? new PickFromDeckAction() : new PickFromDiscardPileAction()
        }
        Card newCard = action.pick(game)
        hand.add(newCard)
    }
}

interface PlayerPickAction {
    Card pick(Game game)
}

class PickFromDeckAction implements PlayerPickAction {

    @Override
    Card pick(Game game) {
        Card pick = game.deck.pop()
        boolean getSecondOne = new Random().nextInt(1) == 1
        if (getSecondOne) {
            game.addToDiscardPile(pick)
            pick = game.deck.pop()
        }
        return pick
    }
}

class PickFromDiscardPileAction implements PlayerPickAction {

    @Override
    Card pick(Game game) {
        return game.getFromDiscardPile()
    }
}