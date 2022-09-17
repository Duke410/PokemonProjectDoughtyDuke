public class Potion extends Item{
    public Potion(String newName,int newNumber, boolean newSuper){
        super(newName,newNumber,newSuper);
    }
    //implementation of the effect method that will heal a pokemon a certain amount, for a super potion or a regular one
    public void effect (Player thisPlayer, Player otherPlayer, Pokemon affected, int healNum){
        if(super.getIsSuper()){
            healNum = healNum*2;
        }
        affected.setHealth(affected.getHealth()+healNum);
    }
}
