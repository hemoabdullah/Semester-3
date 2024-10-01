package experiment3;

public class Railway {
    private String name;
    private String railwayClass;
    private Employee machinist;
    private Employee assistant;

    public Railway(String name, String railwayClass, Employee machinist) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
        this.assistant = null; // Initialize as null for cases without assistant
    }

    public Railway(String name, String railwayClass, Employee machinist, Employee assistant) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
        this.assistant = assistant;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRailwayClass(String railwayClass) {
        this.railwayClass = railwayClass;
    }

    public String getRailwayClass() {
        return railwayClass;
    }

    public void setMachinist(Employee machinist) {
        this.machinist = machinist;
    }

    public Employee getMachinist() {
        return machinist;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    public Employee getAssistant() {
        return assistant;
    }

    public String info() {
        String info = "Name: " + this.name + "\n" + "Railway Class: " + this.railwayClass + "\n";
        info += "Machinist: " + this.machinist.info();
        if (this.assistant != null) {
            info += "Assistant: " + this.assistant.info();
        }
        return info;
    }
}