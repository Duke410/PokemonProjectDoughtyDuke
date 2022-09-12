public class Pokemon {

    String name;
    int level;
    int health;
    Attack[] attacks = new Attack[4];

    public Pokemon(String name, int level, int health, String attack1, String attack2, String attack3, String attack4){
        this.name = name;
        this.level = level;
        this.health = health;

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
    public Attack getAttacks(int index){
        return attacks[index];
    }
    public void setAttacks(int index, Attack attack){
        this.attacks[index] = attack;
    }

    public Attack chooseAttack (Pokemon attackingPokemon){

    }
    public void doAttack (Pokemon attackingPokemon, Pokemon attackedPokemon){

    }
    public void randomAttack(Pokemon attackedPokemon){

    }


}
