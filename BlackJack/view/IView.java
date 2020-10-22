package BlackJack.view;

public interface IView
{
  void DisplayWelcomeMessage();
  //I put into IBasicView
  //int GetInput();
  void DisplayCard(BlackJack.model.Card a_card);
  void DisplayPlayerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  void DisplayDealerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  void DisplayGameOver(boolean a_dealerIsWinner);
    void collectEvents();
    boolean wantsToStartNewGame();
    boolean wantsToHit();
    boolean wantsToStand();
    boolean wantsToQuit();
}