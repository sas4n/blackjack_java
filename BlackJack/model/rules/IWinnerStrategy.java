package BlackJack.model.rules;

public interface IWinnerStrategy {
    boolean isDealerWinner(int dealerCore, int playerScore, int maxScore);
}
