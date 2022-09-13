import java.util.ArrayList;

public class Player {

    String playerName;
    int playerNumber;
    ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();

    public Player(String playerName, int playerNumber){
        this.playerName = playerName;

        //
        pokemonList.add(Pokemon("Snorlax",  ))

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
    public Pokemon getPokemonList(int index){
        return pokemonList.get(index);
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
