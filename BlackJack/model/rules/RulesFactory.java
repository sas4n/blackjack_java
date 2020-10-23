package BlackJack.model.rules;

public class RulesFactory {

  public IHitStrategy GetHitRule() {
    //return new Soft17RuleFactory;
    return new BasicHitStrategy();
  }

  public INewGameStrategy GetNewGameRule() {
    return new InternationalNewGameStrategy();
    //return new AmericanNewGameStrategy();
  }

  public IWinnerStrategy GetWinnerStrategy(){
    // return new PlayerWinStrategy();
    return new DealerWinStrategy();
  }
}