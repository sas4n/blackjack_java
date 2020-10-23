package BlackJack.model.rules;

import BlackJack.model.Player;

public class Soft17RuleStrategy implements IHitStrategy{
    @Override
    public boolean DoHit(Player a_dealer) {
        return false;
    }
}
