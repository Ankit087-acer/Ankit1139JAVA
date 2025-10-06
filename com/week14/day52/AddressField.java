package Com.week14.day52;
import java.util.*;
class Pers{
    private String address;
    public void setAddress(String addr) {
        address = addr;
    }
    public void printAddress() {
        System.out.println("Address: " + address);
    }
}
public class AddressField {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pers p = new Pers();

        System.out.print("Enter your address: ");
        String userAddress = sc.nextLine();
        p.setAddress(userAddress);
        System.out.print("The details are as follows:");
        p.printAddress();

        sc.close();
    }
}
