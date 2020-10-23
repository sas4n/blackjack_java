package BlackJack.model.rules;

import BlackJack.model.Card;
import BlackJack.model.Dealer;
import BlackJack.model.Deck;
import BlackJack.model.Player;

public abstract class Factory implements INewGameStrategy {
    public void getCard(Deck deck, Player role, boolean show) {
        Card card = deck.GetCard();
        card.Show(show);
        role.DealCard(card);
    }
    public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
        /** Rona added */
        getCard(a_deck, a_player, true);
        getCard(a_deck, a_dealer, true);
        getCard(a_deck, a_player, true);
        //we have to fix it in order to have no duplication


        //    Card c;
//
//    c = a_deck.GetCard();
//    c.Show(true);
//    a_player.DealCard(c);
//
//    c = a_deck.GetCard();
//    c.Show(true);
//    a_dealer.DealCard(c);
//
//    c = a_deck.GetCard();
//    c.Show(true);
//    a_player.DealCard(c);



        return true;
    }
}
