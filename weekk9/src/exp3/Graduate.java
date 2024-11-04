package exp3;

public class Graduate extends Student3 implements ICumlaude3, IAchiever {

    public Graduate(String name) {
        super(name);
    }

    @Override
    public void graduate() {
        System.out.println("I have completed my THESIS");
    }

    @Override
    public void achieveHighGPA() {
        System.out.println("My GPA is above 3.71");
    }

    @Override
    public void winCompetition() {
        System.out.println("I have won an INTERNATIONAL competition");
    }

    @Override
    public void publishScientificPaper() {
        System.out.println("I published an article in an INTERNATIONAL journal");
    }
}
