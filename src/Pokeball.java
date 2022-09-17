public class Pokeball extends Item{
    //implementation of the effect method that will take the captured pokemon from one player and add it to the other player
    public void effect (Player thisPlayer, Player otherPlayer, Pokemon affected, int healNum){
        otherPlayer.subtractPokemon(affected);
        thisPlayer.addPokemon(affected);
    }
}
