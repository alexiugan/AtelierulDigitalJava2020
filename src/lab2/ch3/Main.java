package lab2.ch3;

public class Main {
    public static void main(String [] args){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.play();
        d.walk();
        c.eat();
        c.play();
        c.walk();
        a.eat();
        a.walk();
        e.eat();
        e.walk();
        p.play();

        ((Cat)p).walk();
        ((Fish)a).play();
    }
}
