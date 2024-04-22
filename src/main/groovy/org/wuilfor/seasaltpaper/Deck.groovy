package org.wuilfor.seasaltpaper

class Deck {
    private Stack<Card> cards = []

    void addCard(Card card) {
        cards.add(card)
    }

    Card pop() {
        return cards.pop()
    }

    Card putOnTop(Card card) {
        return cards.push(card)
    }

    Deck addCard(Card card, int numberOfCopies) {
        Card cardToAdd = card
        for (i in 0..<numberOfCopies) {
            addCard(cardToAdd)
            cardToAdd = card.clone()
        }
    }
}
