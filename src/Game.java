public class Game {
/*
Game Class
Stage (enum) (with Bag, Battle, Attacks, Pokemon)
Instance variables:
currentStage (Stage)
Bag (array of Items)
Player play1
Player play2
Pokemon chosen1
Pokemon chosen2
Methods:
public Stage chooseStage ()
Will ask for a stage and change it to that all within method.
public void printBattle ()
public void printOtherStage (Stage currentStage)
 */

    public enum Stage {Bag, Battle, Attacks, Pokemon};

    private Stage currentStage;
    private Item[] bag;
    private Player play1;
    private Player play2;
    private Pokemon chosen1;
    private Pokemon chosen2;

    public Stage getCurrentStage() {
        return currentStage;
    }
    public void setCurrentStage(Stage currentStage) {
        this.currentStage = currentStage;
    }

    public Item[] getBag() {
        return bag;
    }
    public void setBag(Item[] bag) {
        this.bag = bag;
    }

    public Player getPlay1() {
        return play1;
    }
    public void setPlay1(Player play1) {
        this.play1 = play1;
    }

    public Player getPlay2() {
        return play2;
    }
    public void setPlay2(Player play2) {
        this.play2 = play2;
    }

    public Pokemon getChosen1() {
        return chosen1;
    }
    public void setChosen1(Pokemon chosen1) {
        this.chosen1 = chosen1;
    }

    public Pokemon getChosen2() {
        return chosen2;
    }
    public void setChosen2(Pokemon chosen2) {
        this.chosen2 = chosen2;
    }

    /*
    public Stage chooseStage (){
        //Will ask for a stage and change it to that all within method.

    }

     */

    public void printBattle () {
        //public void printOtherStage (Stage currentStage)

    }


}
