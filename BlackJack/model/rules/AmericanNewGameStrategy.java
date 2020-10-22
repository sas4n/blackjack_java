package BlackJack.model.rules;

import BlackJack.model.Deck;
import BlackJack.model.Dealer;
import BlackJack.model.Player;
import BlackJack.model.Card;  

class AmericanNewGameStrategy implements INewGameStrategy {

  //in case of tie winner would be dealer

  public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
    Card c;

    //we have to fix it to not have duplicate codes here
    c = a_deck.GetCard();
    c.Show(true);
    a_player.DealCard(c);

    c = a_deck.GetCard();
    c.Show(true);
    a_dealer.DealCard(c);

    c = a_deck.GetCard();
    c.Show(true);
    a_player.DealCard(c);

    c = a_deck.GetCard();
    c.Show(false);
    a_dealer.DealCard(c);

    return true;
  }
}