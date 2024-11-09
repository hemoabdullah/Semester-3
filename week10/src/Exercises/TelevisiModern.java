package Exercises;

public class TelevisiModern extends Elektronik {
    private String modeInput;

    public TelevisiModern() {
        super(220); // Sets voltase to 220 for TelevisiModern
        this.modeInput = "HDMI";
    }

    public String getModeInput() {
        return modeInput;
    }
}
