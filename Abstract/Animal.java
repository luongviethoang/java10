package java10.Abstract;

abstract public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }

    abstract public void greets();
    public String getName(){
        return name;
    };
}