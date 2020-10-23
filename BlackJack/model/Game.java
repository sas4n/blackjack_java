package BlackJack.model;

public class Game {

  private Dealer m_dealer;
  private Player m_player;

  public Game()
  {
    m_dealer = new Dealer(new BlackJack.model.rules.RulesFactory());
    m_player = new Player();
  }
  public void SubscriptionToNewCards(ICardObserver subscriber)
  {
    m_player.Subscribe(subscriber);
    m_dealer.Subscribe(subscriber);
  }
    
  public boolean IsGameOver()
  {
    return m_dealer.IsGameOver();
  }
  
  public boolean IsDealerWinner()
  {
    return m_dealer.IsDealerWinner(m_player);
  }
  
  public boolean NewGame()
  {

    return m_dealer.NewGame(m_player);
  }
  
  public boolean Hit()
  { return m_dealer.Hit(m_player);
  }
  
  public boolean Stand()
  {
    // TODO: Implement this according to Game_Stand.sequencediagram
    return m_dealer.Stand();
  }
  
  public Iterable<Card> GetDealerHand()
  {
    return m_dealer.GetHand();
  }
  
  public Iterable<Card> GetPlayerHand()
  {
    return m_player.GetHand();
  }
  
  public int GetDealerScore()
  {
    return m_dealer.CalcScore();
  }
  
  public int GetPlayerScore()
  {
    return m_player.CalcScore();
  }

//  public Player getPlayer(){
//    return m_player;
//  }
//  public void add(ICardObserver subscriber){
//    m_dealer.addSubscriber(subscriber);
//  }
}