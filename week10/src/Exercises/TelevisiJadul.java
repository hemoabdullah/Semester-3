package Exercises;

public class TelevisiJadul extends Elektronik {
    private String modeInput;

    public TelevisiJadul() {
        super(220); // Sets voltase to 220 for TelevisiJadul
        this.modeInput = "DVI";
    }

    public String getModeInput() {
        return modeInput;
    }
}
