package Experiments;

public class Tester1 {
    public static void main(String[] args) {
        Employee e;
        Payable p;

        PermanentEmployee pEmp = new PermanentEmployee("majid", 400);
        InternshipEmployee iEmp = new InternshipEmployee("hammam", 6);
        ElectricityBill eBill = new ElectricityBill(100, "R-1");

        e = pEmp;
        System.out.println(e.getEmployeeInfo());

        e = iEmp;
        System.out.println(e.getEmployeeInfo());

    }
}