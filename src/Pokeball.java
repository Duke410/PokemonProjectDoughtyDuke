public class Pokeball extends Item{
    /*
    Pokeball Class
    public void effect(Player thisPlayer, Play otherPlayer, healNum)
    Find the pokemon that the other player currently has on the field, call subtractPokemon for the other player, and call addPokemon with the captured pokemon

     */
    public void effect (Player thisPlayer, Player otherPlayer, Pokemon affected, int healNum){
        otherPlayer.subtractPokemon(affected);
        thisPlayer.addPokemon(affected);
    }
}
