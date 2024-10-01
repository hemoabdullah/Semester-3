package experiment4;

public class MainExperiment4 {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("23453", "Mr.Krab");
        Passenger p2 = new Passenger("54324", "Budi");
        Carriage carriage = new Carriage("A", 10);
        carriage.setPassenger(p1, 1);
        carriage.setPassenger(p2, 1);
        System.out.println(carriage.info());
        
        
    }
}