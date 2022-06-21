package Misc;

public enum Levels {

    INSTANCE;

    int value;

    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
}
