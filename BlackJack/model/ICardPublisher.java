package BlackJack.model;

public interface ICardPublisher {
    void Subscribe(ICardObserver subscriber);
    void Notify(Card card);
}
