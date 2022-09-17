import java.util.Scanner;
import java.util.Random;

public class Pokemon {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    String name;
    int level;
    int health;
    Attack[] attacks = new Attack[4];

    public Pokemon(String name, int level, String attack1, String attack2, String attack3, String attack4){
        this.name = name;
        this.level = level;
        this.health = 50;

        //based on attack names passed in. All pokemon have 1, 2, 3, 4 as the multipliers for their pokemon
        attacks[0] = new Attack(attack1, 1);
        attacks[1] = new Attack(attack2, 2);
        attacks[2] = new Attack(attack3, 3);
        attacks[3] = new Attack(attack4, 4);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public Attack[] getAttacks(){
        return attacks;
    }
    public void setAttacks(Attack[] attacks){
        this.attacks = attacks;
    }

    public Attack chooseAttack (){
        //printing attacks menu first
        Game.printOtherStage(Game.Stage.Attacks);
        System.out.println("Select an attack: ");
        for(int i = 0; i<4; i++){
            if(sc.nextLine().equals(attacks[i].getName())){
                return attacks[i];
            } else {
                return attacks[0];
            }
        }
        return new Attack("n/a",0);
    }
    public void doAttack (Pokemon attackedPokemon){
        //allows someone to choose an attack and then calculates damage and level of other pokemon to determine how much to subtract from other pokemon
        //equation:   health  = (health) - (100 * attackDamage)/(level)
        //(so that the higher the level, the less damage taken)
        //(damages range from 1-4, and levels from 10-50, so the health reduction will always be between 2-40) (health starts at 50)
        attackedPokemon.setHealth(attackedPokemon.getHealth() - (100 * chooseAttack().getDamage() / attackedPokemon.getLevel()) );
    }
    public void randomAttack(Pokemon attackedPokemon){
        Random random = new Random();
        //same formula as above, but instead of choosing attack it is a random attack
        attackedPokemon.setHealth(attackedPokemon.getHealth() - (100 * attacks[random.nextInt(4)].getDamage() / attackedPokemon.getLevel()) );
    }

}
