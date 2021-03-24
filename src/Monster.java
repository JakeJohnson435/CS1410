abstract public class Monster
{
    abstract public void speak();

    //We have to declare speak, but it doesn't really need a body.
    //public void speak() {}

    public void yell(){
        System.out.println("ARRRRGHHHH!");
    }

    //An abstract method has to be in an abstract class, but you may have non-abstract
    //methods inside an abstract class.

    //abstract void speak();

    //Once you make a method abstract method it needs to be implemented in the subclasses
    //comment it out in one of the subclasses and see what happens.
}