import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    String playerName;
    int playerNumber;
    ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();

    public Player(String playerName, int playerNumber){
        this.playerName = playerName;
        this.playerNumber = playerNumber;

        //the six pokemon initializations, with random levels from 10-50, with specific attack names
        //first attack is the least powerful, up to the last one which is the most powerful
        if(playerNumber == 1){
            pokemonList.add(new Pokemon("Snorlax", random.nextInt(41) + 10, "Yawn", "Lick", "Frustration", "Stomp"));
            pokemonList.add(new Pokemon("Relicanth", random.nextInt(41) + 10, "Muddy Water", "Earthquake", "Ancient Power", "Stealth Rocks"));
            pokemonList.add(new Pokemon("Alolan Exeggutor",random.nextInt(41) + 10, "Draco Meteor", "Giga Drain", "Flamethrower", "Psychic"));
            pokemonList.add(new Pokemon("Chandelure",random.nextInt(41) + 10, "Will O Wisp", "Shadow Ball", "Mystical Fire", "Energy Ball"));
            pokemonList.add(new Pokemon("Zacian" ,random.nextInt(41) + 10, "Iron Head", "Close Combat", "Substitute", "Protect"));
            pokemonList.add(new Pokemon("Thundurus",random.nextInt(41) + 10, "Wild Charge", "Fly", "Superpower", "Protect"));
        }
        if(playerNumber == 2){
            pokemonList.add(new Pokemon("Galarian Darmanitan", random.nextInt(41) + 10, "Icicle Crash", "Superpower", "Rock Slide", "Flare Blitz"));
            pokemonList.add(new Pokemon("Calyrex", random.nextInt(41) + 10, "Astral Barrage", "Expanding Force", "Trick Room", "Imprison"));
            pokemonList.add(new Pokemon("Whimsicott", random.nextInt(41) + 10, "Tailwind", "Moonblast", "Helping Hand", "Taunt"));
            pokemonList.add(new Pokemon("Urshifu", random.nextInt(41) + 10, "Wicked Blow", "Close Combat", "Sucker Punch", "Rock Slide"));
            pokemonList.add(new Pokemon("Galvantula", random.nextInt(41) + 10, "Electroweb", "Bug Buzz", "Thunder Wave", "Sticky Web"));
            pokemonList.add(new Pokemon("Galarian Slowbro", random.nextInt(41) + 10, "Shell Side Arm", "Psychic", "Trick Room", "Calm Mind"));
        }

    }

    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(){
        this.playerName = playerName;
    }
    public int getPlayerNumber(){
        return playerNumber;
    }
    public void setPlayerNumber(){
        this.playerName = playerName;
    }
    public ArrayList<Pokemon> getPokemonList(){
        return pokemonList;
    }


    public void addPokemon(Pokemon newPokemon){
        pokemonList.add(newPokemon);
    }
    public void subtractPokemon(Pokemon lostPokemon){
        for(int i = 0; i<= pokemonList.size(); i++){
            if(pokemonList.get(i).getName().equals(lostPokemon.getName())){
                pokemonList.remove(i);
            }
        }
    }
    public Pokemon choosePokemon(){
        thisGame.printOtherStage(Game.Stage.Pokemon);
        System.out.println("Choose a Pokemon");
        String input = sc.nextLine();
        for(int i = 0; i< pokemonList.size(); i++){
            if(input.equals(pokemonList.get(i).getName())){
                return pokemonList.get(i);
            }
        }

    }
    public Item chooseItem(){
        printOtherStage(Game.Stage.Bag);
        System.out.println("Choose an item: ");
        String input = sc.nextLine();
        for(int i = 0; i<3; i++){
            if(input.equals(thisGame.getBag[i].getName())){
                return thisGame.getBag[i];
            }
        }
    }
    public void runAway(){

    }
    public void ranChangePokemon(){
        if (Math.random()<0.4){
            int chosen = random.nextInt(pokemonList.size());
            thisGame.getChosen2.setName(pokemonList.get(chosen).getName());
            thisGame.getChosen2.setLevel(pokemonList.get(chosen).getLevel());
            thisGame.getChosen2.setHealth(pokemonList.get(chosen).getHealth());
            thisGame.getChosen2.setAttacks(pokemonList.get(chosen).getAttacks());
        }
    }

}
