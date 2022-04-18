package java10.Abstract;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}