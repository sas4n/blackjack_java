package BlackJack.model.rules;

import BlackJack.model.Card;
import BlackJack.model.Dealer;
import BlackJack.model.Player;

public class Soft17RuleStrategy implements IHitStrategy{

    @Override
    public boolean DoHit(Player a_dealer) {
       if(isSoft17(a_dealer)) {
           if(a_dealer.CalcScore() == 17) {
               return true;
           }
       }

           return a_dealer.CalcScore() <17;
    }

    private boolean isSoft17(Player a_dealer){

            for(Card c : a_dealer.GetHand()){
                if(c.GetValue() == Card.Value.Ace)
                    return true;
            }

        return false;
    }
}
