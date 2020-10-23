package BlackJack.controller;

import BlackJack.model.Card;
import BlackJack.model.ICardObserver;
import BlackJack.view.IView;
import BlackJack.model.Game;

public class PlayGame implements ICardObserver {
    private IView a_view;
    private Game a_game;

    public PlayGame(IView iView, Game a_game) {
        this.a_view = iView;
        this.a_game = a_game;
    }

    @Override
    public void updateNewCard(Card card) {
        a_view.DisplayCard(card);
        a_view.Pause();
    }

    public void showPlayerHand() {
        a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
        a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());
    }

    public boolean Play() {
        a_view.DisplayWelcomeMessage();
        //a_game.getPlayer().addSubscriber(a_view);

        showPlayerHand();

        if (a_game.IsGameOver()) {
            a_view.DisplayGameOver(a_game.IsDealerWinner());
        }

        //here we have hidden dependency
        //we need to use enum to remove hidden dependency
        a_view.collectEvents();

        if (a_view.wantsToStartNewGame()) {
            a_game.NewGame();
        } else if (a_view.wantsToHit()) {
            a_game.Hit();

        } else if (a_view.wantsToStand()) {
            a_game.Stand();
        } else if (a_view.wantsToQuit()) {
            return false;
        }

        return true;
//        int input = a_view.GetInput();
//
//        if (input == 'p') {
//            a_game.NewGame();
//        } else if (input == 'h') {
//            a_game.Hit();
//        } else if (input == 's') {
//            a_game.Stand();
//        }
//
//        return input != 'q';
    }
}