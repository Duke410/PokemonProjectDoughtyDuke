import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    //enum to keep track of the stage of the game
    public enum Stage {Bag, Battle, Attacks, Pokemon};

    //instance variables for the game
    private static Stage currentStage;
    private static Item[] bag;
    private static Player play1;
    private static Player play2;
    private static Pokemon chosen1;
    private static Pokemon chosen2;

    //accessors and mutators for the variables
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

    //initialize an instance of the game class
    public Game(){
        play1 = new Player("Player 1",1);
        play2 = new Player("Player 2",2);
        chosen1 = play1.getPokemonList().get(0);
        chosen2 = play2.getPokemonList().get(0);
    }

    public Stage chooseStage (){
        //Will ask for a stage and change it to that all within method
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

    public static void printBattle () {
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

    public static void printOtherStage (Stage currentStage){
            String side = "*";
            String blankSpace = "                           ";
            String divider = "---------------------------";

            int height = 14;
            int width = 29;
            int linesPrinted = 0;
            String lineStr;
            String title;
            Attack[] thingsListA = chosen1.getAttacks();
            Item[] thingsListB = bag;
            ArrayList<Pokemon> thingsListP = play1.getPokemonList();

        if(currentStage.equals(Stage.Attacks)){
            title = "Attacks";
        }
        else if(currentStage.equals(Stage.Bag)){
            title = "Bag";
        }
        else{
            title = "Pokemon";
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
                if(linesPrinted-2<8){
                    switch(title) {
                        case "Attacks":
                            lineStr = lineStr = thingsListA[linesPrinted - 2].getName();

                            break;
                        case "Pokemon":
                            lineStr = lineStr = "Lvl " + thingsListP.get(linesPrinted - 2).getLevel() + ' ' + thingsListP.get(linesPrinted - 2);
                            break;
                        case "Bag":
                            lineStr =  thingsListB[linesPrinted - 2].getNumber()+"X " + thingsListB[linesPrinted - 2];
                            break;
                        default:
                            lineStr = side+blankSpace+side;
                            break;
                    }
                    System.out.print(side);
                    System.out.print(lineStr);
                    printSpaces(lineStr);
                    System.out.println(side);
                    linesPrinted++;
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
