public class Pokeball extends Item{
    public Pokeball(String newName,int newNumber, boolean newSuper){
        super(newName,newNumber,newSuper);
    }

    //implementation of the effect method that will take the captured pokemon from one player and add it to the other player
    public void effect (Player thisPlayer, Player otherPlayer, Pokemon affected, int healNum){
        if(healNum>0){
            if(super.getIsSuper()){
                healNum = healNum*2;
            }
            affected.setHealth(affected.getHealth()+healNum);
        }
        else{
            otherPlayer.subtractPokemon(affected);
            thisPlayer.addPokemon(affected);
        }
    }
}
