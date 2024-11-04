package exp1;

public class Program {
    public static void main(String[] args) {
        Cat villageCat = new Cat();
        Fish dolphin = new Fish();

        Person ani = new Person("Ani");
        Person budi = new Person("Budi");

        ani.setPet(villageCat);
        budi.setPet(dolphin);

        ani.takePetForAWalk();
        budi.takePetForAWalk();
    }
}
