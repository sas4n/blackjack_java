package BlackJack.model.rules;

import BlackJack.model.Deck;
import BlackJack.model.Dealer;
import BlackJack.model.Player;
import BlackJack.model.Card;  

class AmericanNewGameStrategy extends Factory {

  //in case of tie winner would be dealer

  public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
    /** Rona added */
    /*getCard(a_deck, a_player, true);
    getCard(a_deck, a_dealer, true);
    getCard(a_deck, a_player, true);*/
    super.NewGame(a_deck,a_dealer,a_player);
    getCard(a_deck, a_dealer, false);

    //we have to fix it to not have duplicate codes here


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
//
//    c = a_deck.GetCard();
//    c.Show(false);
//    a_dealer.DealCard(c);

    return true;
  }
}