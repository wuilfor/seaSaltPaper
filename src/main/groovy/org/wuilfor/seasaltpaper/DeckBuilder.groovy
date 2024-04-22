package org.wuilfor.seasaltpaper

import java.util.function.Function

abstract class DeckBuilder {

    static Deck build() {
        Deck deck = new Deck()

        deck.addCard(new EffectCard(type: CardType.MERMAID, color: CardColor.WHITE, effectToApply: mermaidEffect()), 4)
        addMultipliers(deck)

        addBoats(deck)
        addFishes(deck)
        addCrabs(deck)
        addSwimmer(deck)
        addSharks(deck)

        addShells(deck)
        addOctopus(deck)
        addPenguins(deck)
        addSailors(deck)

        return deck
    }

    private static void addSailors(Deck deck) {
        deck.addCard(new CollectableCard(type: CardType.SAILOR, color: CardColor.LIGHTPINK), 1)
        deck.addCard(new CollectableCard(type: CardType.SAILOR, color: CardColor.ORANGE), 1)
    }

    private static void addPenguins(Deck deck) {
        deck.addCard(new CollectableCard(type: CardType.PENGUIN, color: CardColor.LIGHTPINK), 1)
        deck.addCard(new CollectableCard(type: CardType.PENGUIN, color: CardColor.LIGHTORANGE), 1)
        deck.addCard(new CollectableCard(type: CardType.PENGUIN, color: CardColor.PURPLE), 1)
    }

    private static void addOctopus(Deck deck) {
        deck.addCard(new CollectableCard(type: CardType.OCTOPUS, color: CardColor.LIGHTBLUE), 1)
        deck.addCard(new CollectableCard(type: CardType.OCTOPUS, color: CardColor.YELLOW), 1)
        deck.addCard(new CollectableCard(type: CardType.OCTOPUS, color: CardColor.LIGHTGREEN), 1)
        deck.addCard(new CollectableCard(type: CardType.OCTOPUS, color: CardColor.LIGHTGREY), 1)
        deck.addCard(new CollectableCard(type: CardType.OCTOPUS, color: CardColor.PURPLE), 1)
    }

    private static void addShells(Deck deck) {
        deck.addCard(new CollectableCard(type: CardType.SHELL, color: CardColor.DARKBLUE), 1)
        deck.addCard(new CollectableCard(type: CardType.SHELL, color: CardColor.LIGHTBLUE), 1)
        deck.addCard(new CollectableCard(type: CardType.SHELL, color: CardColor.BLACK), 1)
        deck.addCard(new CollectableCard(type: CardType.SHELL, color: CardColor.YELLOW), 1)
        deck.addCard(new CollectableCard(type: CardType.SHELL, color: CardColor.LIGHTGREEN), 1)
        deck.addCard(new CollectableCard(type: CardType.SHELL, color: CardColor.LIGHTGREY), 1)
    }

    private static void addMultipliers(Deck deck) {
        deck.addCard(new MultiplierCard(type: CardType.CAPTAIN, color: CardColor.LIGHTORANGE), 1)
        deck.addCard(new MultiplierCard(type: CardType.PENGUIN_COLONY, color: CardColor.LIGHTGREEN), 1)
        deck.addCard(new MultiplierCard(type: CardType.LIGHTHOUSE, color: CardColor.PURPLE), 1)
        deck.addCard(new MultiplierCard(type: CardType.SHOAL, color: CardColor.LIGHTGREY), 1)
    }

    private static void addSharks(Deck deck) {
        deck.addCard(new DuoCard(type: CardType.SHARK, color: CardColor.DARKBLUE, effectToApply: swimmerAndSharkEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.SHARK, color: CardColor.LIGHTBLUE, effectToApply: swimmerAndSharkEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.SHARK, color: CardColor.BLACK, effectToApply: swimmerAndSharkEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.SHARK, color: CardColor.PURPLE, effectToApply: swimmerAndSharkEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.SHARK, color: CardColor.LIGHTGREEN, effectToApply: swimmerAndSharkEffect()), 1)
    }

    private static void addSwimmer(Deck deck) {
        deck.addCard(new DuoCard(type: CardType.SWIMMER, color: CardColor.DARKBLUE, effectToApply: swimmerAndSharkEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.SWIMMER, color: CardColor.LIGHTBLUE, effectToApply: swimmerAndSharkEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.SWIMMER, color: CardColor.BLACK, effectToApply: swimmerAndSharkEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.SWIMMER, color: CardColor.YELLOW, effectToApply: swimmerAndSharkEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.SWIMMER, color: CardColor.LIGHTORANGE, effectToApply: swimmerAndSharkEffect()), 1)
    }


    private static void addCrabs(Deck deck) {
        deck.addCard(new DuoCard(type: CardType.CRAB, color: CardColor.DARKBLUE, effectToApply: crabEffect()), 2)
        deck.addCard(new DuoCard(type: CardType.CRAB, color: CardColor.LIGHTBLUE, effectToApply: crabEffect()), 2)
        deck.addCard(new DuoCard(type: CardType.CRAB, color: CardColor.BLACK, effectToApply: crabEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.CRAB, color: CardColor.YELLOW, effectToApply: crabEffect()), 2)
        deck.addCard(new DuoCard(type: CardType.CRAB, color: CardColor.LIGHTGREEN, effectToApply: crabEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.CRAB, color: CardColor.LIGHTGREY, effectToApply: crabEffect()), 1)
    }

    private static void addFishes(Deck deck) {
        deck.addCard(new DuoCard(type: CardType.FISH, color: CardColor.DARKBLUE, effectToApply: fishEffect()), 2)
        deck.addCard(new DuoCard(type: CardType.FISH, color: CardColor.LIGHTBLUE, effectToApply: fishEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.FISH, color: CardColor.BLACK, effectToApply: fishEffect()), 2)
        deck.addCard(new DuoCard(type: CardType.FISH, color: CardColor.YELLOW, effectToApply: fishEffect()), 1)
        deck.addCard(new DuoCard(type: CardType.FISH, color: CardColor.LIGHTGREEN, effectToApply: fishEffect()), 1)
    }

    private static void addBoats(Deck deck) {
        deck.addCard(new DuoCard(type: CardType.BOAT, color: CardColor.DARKBLUE, effectToApply: boatEffect()), 2)
        deck.addCard(new DuoCard(type: CardType.BOAT, color: CardColor.LIGHTBLUE, effectToApply: boatEffect()), 2)
        deck.addCard(new DuoCard(type: CardType.BOAT, color: CardColor.YELLOW, effectToApply: boatEffect()), 2)
        deck.addCard(new DuoCard(type: CardType.BOAT, color: CardColor.BLACK, effectToApply: boatEffect()), 2)
    }

    private static Function<Game, Void> mermaidEffect() {
        return new Function<Game, Void>() {
            @Override
            Void apply(Game game) {
                if (game.getCurrentPlayer().hand.findAll { it.type == CardType.MERMAID }.size() == 4) {
                    game.winner()
                }
            }
        }
    }

    private static Function<Game, Void> crabEffect() {
        //TODO
        return new Function<Game, Void>() {
            @Override
            Void apply(Game game) {

                return null
            }
        }
    }

    private static Function<Game, Void> boatEffect() {
        //TODO
        return new Function<Game, Void>() {
            @Override
            Void apply(Game game) {
                return null
            }
        }
    }

    private static Function<Game, Void> fishEffect() {
        //TODO
        return new Function<Game, Void>() {
            @Override
            Void apply(Game game) {
                return null
            }
        }
    }

    private static Function<Game, Void> swimmerAndSharkEffect() {
        //TODO
        return new Function<Game, Void>() {
            @Override
            Void apply(Game game) {
                return null
            }
        }
    }
}
