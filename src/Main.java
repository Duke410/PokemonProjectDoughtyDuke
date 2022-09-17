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
                    System.out.println("Choose an item: ");
                    String input = sc.nextLine();
                    Item chosen;
                    for (int i = 0; i < 3; i++) {
                        if (input.equals(thisGame.getBag()[i].getName())) {
                            if(input.equals("Pokeball")){
                                chosen = new Pokeball("Pokeball",thisGame.getBag()[i].getNumber(), thisGame.getBag()[i].getIsSuper());
                                break;
                            } else{
                                chosen = new Potion("Potion",thisGame.getBag()[i].getNumber(), thisGame.getBag()[i].getIsSuper());
                                break;
                            }
                        } else {
                            chosen = new Pokeball("n/a",0,false);
                        }
                    }
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
