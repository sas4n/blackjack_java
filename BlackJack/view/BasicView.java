package BlackJack.view;

public abstract class BasicView {
    private int input;

    public int GetInput()
    {
        try {
            int c = System.in.read();
            while (c == '\r' || c =='\n') {
                c = System.in.read();
            }
            return c;
        } catch (java.io.IOException e) {
            System.out.println("" + e);
            return 0;
        }
    }

    public void Pause(){
//        try{
//            System.out.println("getting ....");
//            Thread.sleep(2000);
//        }catch (Exception e){}
    }

    public void collectEvents(){
        input = GetInput();
    }
    public boolean wantsToStartNewGame() {
        return input == 'p';
    }

    public boolean wantsToHit() {
        return input == 'h';
    }

    public boolean wantsToStand() {
        return input == 's';
    }

    public boolean wantsToQuit() {
        return input == 'q';
    }
}
