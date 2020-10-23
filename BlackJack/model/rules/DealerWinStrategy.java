package BlackJack.model.rules;

public class DealerWinStrategy implements IWinnerStrategy{
    @Override
    public boolean isDealerWinner(int dealerCore, int playerScore,int maxScore) {
        if (playerScore > maxScore) {
            return true;
        } else if (dealerCore > maxScore) {
            return false;
        }
        return dealerCore == playerScore;
    }
}
