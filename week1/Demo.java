package week1;

public class Demo {
    public static void main(String[] args) {
        // Create and use Car object
        car myCar = new car();
        myCar.setMake("Toyota");
        myCar.setModel("Avanza");
        myCar.setYear(2017);
        myCar.startEngine();
        myCar.showCarInfo();
        myCar.stopEngine();

        // Create and use Truck object
        Truck myTruck = new Truck();
        myTruck.setMake("Big Truck");
        myTruck.setModel("xx300");
        myTruck.setYear(2012);
        myTruck.setLoadCapacity(3.5);
        myTruck.startEngine();
        myTruck.showCarInfo();
        myTruck.loadCargo();
        myTruck.unloadCargo();
        myTruck.stopEngine();

        // Create and use Book object
        Book myBook = new Book();
        myBook.setTitle("secara bisco");
        myBook.setAuthor("Hammam The Genius");
        myBook.openBook();
        myBook.showBookInfo();
        myBook.closeBook();

        // Create and use Computer object
        Computer myComputer = new Computer();
        myComputer.setProcessor("Intel i7");
        myComputer.setMemory(16);
        myComputer.turnOn();
        myComputer.showComputerInfo();
        myComputer.turnOff();

        // Create and use LivingRoomTable object
        LivingRoomTable myTable = new LivingRoomTable();
        myTable.setMaterial("Wood");
        myTable.setColor("Brown");
        myTable.setDimensions(1.5, 0.75);
        myTable.showTableInfo();

        // Create and use Desk object
        Desk myDesk = new Desk();
        myDesk.setMaterial("Metal");
        myDesk.setColor("Black");
        myDesk.setNumberOfDrawers(3);
        myDesk.showDeskInfo();
    }
}
