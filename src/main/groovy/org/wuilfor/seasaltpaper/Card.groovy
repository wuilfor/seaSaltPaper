package org.wuilfor.seasaltpaper

import java.util.function.Function

class Card {
    Type type
    CardColor color;

    Card clone() {
        return new Card(type: type, color: color)
    }
}

class DuoCard extends Card implements Duo {

}

class CollectableCard extends Card implements Collectable {

}

class EffectCard extends Card implements Activable {
    Function<Game, Void> effectToApply

    @Override
    def activateEffect(Game game) {
        return effectToApply.apply(game)
    }

    EffectCard clone() {
        return new EffectCard(type: type, color: color, effectToApply: effectToApply)
    }
}

enum Type {
    CRAB, BOAT, FISH, SWIMMER, SHARK, MERMAID, SHELL, OCTOPUS, PENGUIN, SAILOR, LIGHTHOUSE, SHOAL, PENGUIN_COLONY, CAPTAIN
}

enum CardColor {
    DARKBLUE, LIGHTBLUE, BLACK, YELLOW, LIGHTGREEN, WHITE, PURPLE, LIGHTGREY, LIGHTORANGE, LIGHTPINK, ORANGE
}