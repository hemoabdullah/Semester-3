package exp1;
public abstract class Animal {
    private int age;

    protected Animal() {
        this.age = 0;
    }

    public void increaseAge() {
        this.age += 1;
    }

    public abstract void move();
}
