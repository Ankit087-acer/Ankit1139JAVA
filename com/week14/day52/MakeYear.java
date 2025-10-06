package Com.week14.day52;
import java.util.*;
class Car {
    public String make;
    public int year;
}
public class MakeYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car();
        System.out.print("Enter car make: ");
        myCar.make = sc.nextLine();
        System.out.print("Enter car year: ");
        myCar.year = sc.nextInt();
        System.out.println("\nCar Details:");
        System.out.println("Make: " + myCar.make);
        System.out.println("Year: " + myCar.year);
        sc.close();
    }
}


