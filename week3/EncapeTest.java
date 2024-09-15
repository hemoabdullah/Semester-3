package week3;
public class EncapeTest {
    public static void main(String[] args) {
        EncapeDemo encap = new EncapeDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
        encap.setAge(15); 
        System.out.println("Updated Age : " + encap.getAge());
    }
}