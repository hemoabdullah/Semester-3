package week1;

public class Computer {
    private String processor;  
    private int memory; 

    public void setProcessor(String newProcessor) {  // Method to set the processor
        this.processor = newProcessor;
    }

    public void setMemory(int newMemory) {  // Method to set the memory
        this.memory = newMemory;
    }

    public void turnOn() {  // Method to turn on the computer
        System.out.println("Turning on the computer with " + processor + " processor and " + memory + "GB memory.");
    }

    public void turnOff() {  // Method to turn off the computer
        System.out.println("Turning off the computer.");
    }

    public void showComputerInfo() {  // Method to display computer information
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory + "GB");
    }
}
