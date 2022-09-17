import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public Game thisGame;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game thisGame = new Game();
        boolean gameGoing = true;
        while(gameGoing){
            thisGame.setCurrentStage(thisGame.chooseStage());

            switch(thisGame.getCurrentStage()){
                case Bag:
                    thisGame.printOtherStage();
                    Item chosen = thisGame.getPlay1().chooseItem();
                    if(chosen.getName().equals("Pokeball")){
                         chosen.effect(thisGame.getPlay1(),thisGame.getPlay2(), thisGame.getChosen2(), 0);
                    } else {
                        chosen.effect(thisGame.getPlay1(), thisGame.getPlay2(), thisGame.getChosen1(), 5);
                    }

                    break;
                case Attacks:

                    break;
                case Pokemon:

                    break;
                case Battle:

                    break;
                default:

                    break;
            }

        }
    }
}
