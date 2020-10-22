package BlackJack.model.rules;

import BlackJack.model.Card;
import BlackJack.model.Deck;
import BlackJack.model.Player;

public abstract class Factory {
    public void getCard(Deck deck, Player role, boolean show) {
        Card card = deck.GetCard();
        card.Show(show);
        role.DealCard(card);
    }
}
