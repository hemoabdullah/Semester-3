package exp3;

public class Undergraduate extends Student3 implements ICumlaude3, IAchiever {

    public Undergraduate(String name) {
        super(name);
    }

    @Override
    public void graduate() {
        System.out.println("I have completed my THESIS");
    }

    @Override
    public void achieveHighGPA() {
        System.out.println("My GPA is above 3.51");
    }

    @Override
    public void winCompetition() {
        System.out.println("I have won a NATIONAL competition");
    }

    @Override
    public void publishScientificPaper() {
        System.out.println("I published an article in a NATIONAL journal");
    }
}
