public abstract class Item {

    //initialize variables
    private String name;
    private int number;
    private boolean isSuper;

    //accessors and mutators
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsSuper() {
        return isSuper;
    }
    public void setSuper(boolean aSuper) {
        isSuper = aSuper;
    }

    //method to decrease the amount of an item
    public void decrItemNum (){
        number--;
    }

    //abstract effect method
    public abstract void effect (Player thisPlayer, Player otherPlayer, Pokemon affected, int healNum);


}
