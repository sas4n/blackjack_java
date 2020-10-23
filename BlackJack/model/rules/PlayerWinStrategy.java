package BlackJack.model.rules;

public class PlayerWinStrategy implements IWinnerStrategy {
    @Override
    public boolean isDealerWinner(int dealerCore, int playerScore, int maxScore) {

        if (playerScore > maxScore) {
      return true;
    } else if (dealerCore > maxScore) {
      return false;
    }
    return dealerCore > playerScore;
    }
}
