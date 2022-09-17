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
                    if(input.equals("Pokeball")){
                        chosen = thisGame.getBag()[2];
                        chosen.effect(thisGame.getPlay1(),thisGame.getPlay2(),thisGame.getChosen2(),0);
                    }
                    else if (input.equals("Potion")){
                        chosen = thisGame.getBag()[0];
                        chosen.effect(thisGame.getPlay1(),thisGame.getPlay2(),thisGame.getChosen1(),5);
                    }
                    else{
                        chosen = thisGame.getBag()[1];
                        chosen.effect(thisGame.getPlay1(),thisGame.getPlay2(),thisGame.getChosen1(),5);
                    }
                    break;
                case Attacks:
                    thisGame.printOtherStage();
                    thisGame.getChosen1().doAttack(thisGame.getChosen2());
                    break;
                case Pokemon:
                    thisGame.printOtherStage();
                    thisGame.setChosen1(thisGame.getPlay1().choosePokemon());
                    break;
                case Battle:
                    thisGame.printBattle();
                    System.out.println("Would you like to run? (y/n)");
                    String answer = sc.nextLine();
                    if(answer.equals("y")){
                        gameGoing = false;
                    }
                    else{
                        thisGame.chooseStage();
                    }
                    break;
                default:
                    break;
            }

        }
    }
}
