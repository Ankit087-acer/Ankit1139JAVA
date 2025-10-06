package Com.week14.day52;
class Person {
    private int age;
    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
}
public class DiffPrivatePublic {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(25);
        System.out.println("The age of the person is  " + p.getAge());
    }
}
