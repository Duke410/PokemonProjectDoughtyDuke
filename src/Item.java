public abstract class Item {

    private String name;
    private int number;
    private boolean isSuper;

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

    public void decrItemNum (){
        number--;
    }

    public abstract void effect (Player thisPlayer, Player otherPlayer, int healNum);


}
