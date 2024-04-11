import org.wuilfor.seasaltpaper.CardColor
import org.wuilfor.seasaltpaper.CardType
import org.wuilfor.seasaltpaper.Deck
import org.wuilfor.seasaltpaper.DeckBuilder
import spock.lang.Specification

class DeckBuilderSpecification extends Specification {

    def "deck must contain #expectedCardNumber #cardType cards"(CardType cardType, int expectedCardNumber) {
        when:
          Deck deck = DeckBuilder.build()
        then:
          deck.cards.findAll { it.type == cardType }.size() == expectedCardNumber
        where:
          cardType                | expectedCardNumber
          CardType.CRAB           | 9
          CardType.BOAT           | 8
          CardType.FISH           | 7
          CardType.SWIMMER        | 5
          CardType.SHARK          | 5
          CardType.MERMAID        | 4
          CardType.SHELL          | 6
          CardType.OCTOPUS        | 5
          CardType.PENGUIN        | 3
          CardType.SAILOR         | 2
          CardType.LIGHTHOUSE     | 1
          CardType.SHOAL          | 1
          CardType.PENGUIN_COLONY | 1
          CardType.CAPTAIN        | 1
    }

    def "deck must contain #expectedCardNumber #cardColor cards"(CardColor cardColor, int expectedCardNumber) {
        when:
          Deck deck = DeckBuilder.build()
        then:
          deck.cards.findAll { it.color == cardColor }.size() == expectedCardNumber
        where:
          cardColor             | expectedCardNumber
          CardColor.DARKBLUE    | 9
          CardColor.LIGHTBLUE   | 9
          CardColor.BLACK       | 8
          CardColor.YELLOW      | 8
          CardColor.LIGHTGREEN  | 6
          CardColor.WHITE       | 4
          CardColor.PURPLE      | 4
          CardColor.LIGHTGREY   | 4
          CardColor.LIGHTORANGE | 3
          CardColor.LIGHTPINK   | 2
          CardColor.ORANGE      | 1
    }
}