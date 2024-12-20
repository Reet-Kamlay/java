class Fruit {
    String name;
    String taste;
    int size;

    public Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Eating a " + name + " with a " + taste + " taste.");
    }
}

class Apple extends Fruit {
    public Apple(String name, int size) {
        super(name, "sweet", size);
    }

    @Override
    public void eat() {
        System.out.println("Eating a sweet and juicy " + name + ".");
    }
}

class Orange extends Fruit {
    public Orange(String name, int size) {
        super(name, "tangy", size);
    }

    @Override
    public void eat() {
        System.out.println("Eating a tangy and refreshing " + name + ".");
    }
}
public class assign24 {
    public static void main(String args[]) {
        Fruit Apple=new Apple("Apple",23);
        Apple.eat();
    }
}