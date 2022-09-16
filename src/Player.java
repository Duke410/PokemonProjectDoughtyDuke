import java.util.ArrayList;
import java.util.Random;

public class Player {

    Random random = new Random();

    String playerName;
    int playerNumber;
    ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();

    public Player(String playerName, int playerNumber){
        this.playerName = playerName;


        //the six pokemon initializations, with random levels from 10-50, with specific attack names
        //first attack is the least powerful, up to the last one which is the most powerful
        pokemonList.add(Pokemon("Snorlax", random.nextInt(41)+10,  ));
        pokemonList.add(Pokemon("", ));
        pokemonList.add(Pokemon("", ))

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

    }
    public Item chooseItem(){

    }
    public void runAway(){

    }
    public void ranChangePokemon(){

    }



}
