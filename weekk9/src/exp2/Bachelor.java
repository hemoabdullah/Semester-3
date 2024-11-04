package exp2;

public class Bachelor extends Student implements ICumlaude {

    public Bachelor(String name) {
        super(name);
    }

    @Override
    public void graduate() {
        System.out.println("I have finished my THESIS for undergraduated");
    }

    @Override
    public void achieveHighGPA() {
        System.out.println("My GPA is above 3.51");
    }
}
