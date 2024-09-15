package week3;

public class MemberDemo {
    public static void main(String[] args) {

        Member member1 = new Member("ika ","Batu ");
        System.out.println("Deposito " +member1.getName()+ " Rp. "+member1.getDeposit());
        
        member1.setname("Hammam");
        member1.setAddres("malang");
        member1.deposit(1000000);
        System.out.println("Deposito " +member1.getName()+ " Rp. "+member1.getDeposit());

        member1.loan(500000);
        System.out.println("Deposito " +member1.getName()+ " Rp." +member1.getDeposit());
    }
}