package exp1;

public class Person {
    private String name;
    private Animal pet;

    public Person(String name) {
        this.name = name;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void takePetForAWalk() {
        System.out.println("My name is " + this.name);
        System.out.println("My pet moves by: ");
        this.pet.move();
        System.out.println("-----------------------------------------");
    }
}
