public class Potion extends Item{
    /*
    Potion Class
    public void effect(Player thisPlayer, Play otherPlayer, int healNum)
    Will heal the current selected pokemon of current player based off if the “super” boolean is toggled

     */
    public void effect (Player thisPlayer, Player otherPlayer, Pokemon affected, int healNum){
        if(super.getIsSuper()){
            healNum = healNum*2;
        }
        affected.setHealth(affected.getHealth()+healNum);
    }
}
