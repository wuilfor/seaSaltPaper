package org.wuilfor.seasaltpaper

class Deck {
    Stack<Card> cards = []

    void addCard(Card card) {
        cards.add(card);
    }

    void pop() {
        cards.pop();
    }

    Deck addCard(Card card, int numberOfCopies) {
        Card cardToAdd = card
        for (i in 0..<numberOfCopies) {
            addCard(cardToAdd)
            cardToAdd = card.clone()
        }
    }
}
