package exp2;

public class Student implements ICumlaude {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public void studyOnCampus() {
        System.out.println("I am a student, my name is " + this.name);
        System.out.println("I study on campus.");
    }

    @Override
    public void graduate() {
        System.out.println("Student");
    }

    @Override
    public void achieveHighGPA() {
        System.out.println("Hopefully, I achieve a high GPA.");
    }
}