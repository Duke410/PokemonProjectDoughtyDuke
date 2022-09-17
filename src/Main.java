import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //objects
        Scanner sc = new Scanner(System.in);
        Game thisGame = new Game();
        Player currentPlay = thisGame.getPlay1();

        boolean gameGoing = true;
        while(gameGoing){
            thisGame.printBattle();

            //if its player 1's turn
            if(currentPlay.getPlayerName().equals(thisGame.getPlay1().getPlayerName())) {
                //allowing them to choose stage of game
                thisGame.setCurrentStage(thisGame.chooseStage());
                switch (thisGame.getCurrentStage()) {
                    case Bag:
                        thisGame.printOtherStage();
                        System.out.println("Choose an item: ");
                        String input = sc.nextLine();
                        Item chosen;
                        if (input.equals("Pokeball")) {
                            chosen = thisGame.getBag()[2];
                            chosen.effect(thisGame.getPlay1(), thisGame.getPlay2(), thisGame.getChosen2(), 0);
                        } else if (input.equals("Potion")) {
                            chosen = thisGame.getBag()[0];
                            chosen.effect(thisGame.getPlay1(), thisGame.getPlay2(), thisGame.getChosen1(), 5);
                        } else {
                            chosen = thisGame.getBag()[1];
                            chosen.effect(thisGame.getPlay1(), thisGame.getPlay2(), thisGame.getChosen1(), 5);
                        }
                        break;
                    case Attacks:
                        //allowing player1 to choose attack
                        Attack newAttack = thisGame.getChosen1().chooseAttack();
                        //doing the attack on the chosen2 instance in the player class
                        thisGame.getChosen1().doAttack(thisGame.getChosen2(),newAttack);
                        //updating the actual pokemon list pokemon's health
                        for (int i = 0; i < thisGame.getPlay2().getPokemonList().size(); i++) {
                            if (thisGame.getChosen2().getName().equals(thisGame.getPlay2().getPokemonList().get(i).getName())) {
                                thisGame.getPlay2().getPokemonList().set(i, thisGame.getChosen2());
                            }
                        }
                        thisGame.printBattle();
                        System.out.print(thisGame.getChosen1().getName()+" used "+newAttack.getName());
                        //switching turns to player 2
                        currentPlay = thisGame.getPlay2();
                        break;
                    case Pokemon:
                        thisGame.printOtherStage();
                        thisGame.setChosen1(thisGame.getPlay1().choosePokemon());
                        break;
                    case Battle:
                        thisGame.printBattle();
                        break;
                    default:
                        break;
                }

                System.out.println("Would you like to run? (y/n)");
                String answer = sc.nextLine();
                if (answer.equals("y")) {
                    gameGoing = false;
                }
            }
            else{
                //randomly potentially changing the pokemon for player 2 (40% chance)
                thisGame.getPlay2().ranChangePokemon(thisGame.getChosen2());
                //using a random attack from the selected pokemon on player 1 chosen pokemon
                thisGame.getChosen2().randomAttack(thisGame.getChosen1());
                //updating the actual info in the pokemon list pokemon
                for (int i = 0; i < thisGame.getPlay1().getPokemonList().size(); i++) {
                    if (thisGame.getChosen1().getName().equals(thisGame.getPlay1().getPokemonList().get(i).getName())) {
                        thisGame.getPlay1().getPokemonList().set(i, thisGame.getChosen1());
                    }
                }
                //switching turns
                currentPlay = thisGame.getPlay1();
            }
        }
    }
}
