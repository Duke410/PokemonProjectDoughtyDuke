import java.util.Scanner;

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


    public Stage chooseStage (){
        //Will ask for a stage and change it to that all within method.
        Scanner sc = new Scanner(System.in);
        Stage newStage = Stage.Bag;
        boolean goodChoice = false;
        while(!goodChoice){
            System.out.println("Please enter the stage you would like to go to:\n" +
                    "1: Bag\n" +
                    "2: Battle\n" +
                    "3: Attacks\n" +
                    "4: Pokemon");
            String answer = sc.nextLine();
            if(answer.equals("1")||answer.equals("Bag")){
                newStage = Stage.Bag;
                goodChoice = true;
            }
            else if(answer.equals("2")||answer.equals("Battle")){
                newStage = Stage.Battle;
                goodChoice = true;
            }
            else if(answer.equals("3")||answer.equals("Attacks")){
                newStage = Stage.Attacks;
                goodChoice = true;
            }
            else if(answer.equals("4")||answer.equals("Pokemon")){
                newStage = Stage.Pokemon;
                goodChoice = true;
            }
            else{
                System.out.println("Apologies, that is not a valid choice. Please enter a new one.");
            }
        }
        currentStage = newStage;
        return newStage;
    }

    public static void printSpaces(String lineStr) {
        int maxLength = 27;
        int spaces = maxLength-lineStr.length();
        for(int i = 0;i<spaces;i++){
            System.out.print(' ');
        }
    }

    public void printBattle () {
        String side = "*";
        String blankSpace = "                           ";
        String divider = "___________________________";

        int height = 14;
        int width = 29;
        String lineStr;
        for(int r = 0;r<height;r++){
            if(r==0){
                for(int i = 0;i<width-1;i++){
                    System.out.print(side);
                }
                System.out.println('*');
            }
            if(r==0) {
                lineStr = chosen2.getName() + " Lvl " + chosen2.getLevel();
                System.out.print(side+lineStr);
                printSpaces(lineStr);
                System.out.println(side);
            }
            else if(r==1) {
                lineStr = "Hp: " + chosen2.getHealth();
                System.out.print(side+lineStr);
                printSpaces(lineStr);
                System.out.println(side);
            }
            else if(r==2){
                lineStr = "0   ";
                System.out.print(side);
                printSpaces(lineStr);
                System.out.print(lineStr);
                System.out.println(side);

            }
            else if(r==3){
                lineStr = "-|-  ";
                System.out.print(side);
                printSpaces(lineStr);
                System.out.print(lineStr);
                System.out.println(side);

            }
            else if(r==4){
                lineStr = "/ \\  ";
                System.out.print(side);
                printSpaces(lineStr);
                System.out.print(lineStr);
                System.out.println(side);
            }
            else if(r==6){
                lineStr = "   0";
                System.out.print(side+lineStr);
                printSpaces(lineStr);
                System.out.println(side);

            }
            else if(r==7){
                lineStr = "  -|-";
                System.out.print(side+lineStr);
                printSpaces(lineStr);
                System.out.println(side);

            }
            else if(r==8){
                lineStr = "  / \\";
                System.out.print(side+lineStr);
                printSpaces(lineStr);
                System.out.println(side);
            }
            else if(r==9) {
                lineStr = chosen1.getName() + " Lvl " + chosen1.getLevel();
                System.out.print(side);
                printSpaces(lineStr);
                System.out.print(lineStr);
                System.out.println(side);
            }
            else if(r==10) {
                lineStr = "Hp: " + chosen1.getHealth();
                System.out.print(side);
                printSpaces(lineStr);
                System.out.print(lineStr);
                System.out.println(side);
            }
            else if(r==11) {
                System.out.println(side+divider+side);
            }
            else if(r==12) {
                lineStr = "|Attack|Bag";
                System.out.print(side);
                printSpaces(lineStr);
                System.out.print(lineStr);
                System.out.println(side);
            }
            else if(r==13) {
                lineStr = "|Pokemon|Run";
                System.out.print(side);
                printSpaces(lineStr);
                System.out.print(lineStr);
                System.out.println(side);
            }
            else{
                System.out.println(side+blankSpace+side);
            }
        }

        for(int i = 0;i<width-1;i++){
            System.out.print(side);
        }
        System.out.println('*');

    }

    public void printOtherStage (Stage currentStage){
            String side = "*";
            String blankSpace = "                           ";
            String divider = "---------------------------";

            String stage = "Pokemon";
            int height = 14;
            int width = 29;
            int linesPrinted = 0;
            String[] pokeNames = {"Pidgey", "Pikachu", "Squirtle"};
            int level = 18;
            int number = 5;
            String[] attackNames = {"Growl", "Tackle", "Thunder"};
            String lineStr;
            String title;

        if(stage.equals("Attacks")){
            title = "Attacks";

            //Attack[] thingsList = chosen1.getAttacks();
        }
        else if(stage.equals("Bag")){
            title = "Bag";

            Item[] thingsList = bag;
        }
        else{
            title = "Pokemon";

            //Pokemon thingsList = play1.getPokemonList();
        }

        for(int r = 0;r<height;r++){
            if(r==0){
                for(int i = 0;i<width-1;i++){
                    System.out.print(side);
                }
                System.out.println('*');
            }
            if(r==0) {
                lineStr = title;
                System.out.print(side);
                System.out.print(lineStr);
                printSpaces(lineStr);
                System.out.println(side);
                linesPrinted++;
            }
            else if(r==1){
                System.out.print(side);
                System.out.print(divider);
                System.out.println(side);
                linesPrinted++;
            }
            else if (!(linesPrinted>height)){

                if(linesPrinted-2<pokeNames.length){
                    switch(title) {
                        case "Attacks":
                            lineStr = lineStr = pokeNames[linesPrinted - 2];

                            break;
                        case "Pokemon":
                            lineStr = lineStr = "Lvl " + level + ' ' + pokeNames[linesPrinted - 2];
                            break;
                        case "Bag":
                            lineStr = number+"X " + pokeNames[linesPrinted - 2];
                            break;
                        default:
                            lineStr = "None";
                            break;
                    }
                    System.out.print(side);
                    System.out.print(lineStr);
                    printSpaces(lineStr);
                    System.out.println(side);
                    linesPrinted++;
                    //System.out.print(pokeNames[i]);


                }
                else{
                    System.out.println(side+blankSpace+side);
                }
            }
        }
        for(int i = 0;i<width-1;i++){
            System.out.print(side);
        }
        System.out.println('*');

    }


}
