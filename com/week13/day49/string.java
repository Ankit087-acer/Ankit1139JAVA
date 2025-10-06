package Com.week13.day49;

public class string {
    public static void main(String[] args) {
        String arr="hello";
        String arr2="Ankit";
        for(int i=0;i<arr.length();i++){
            System.out.print(arr.charAt(i)+" ");
        }
        System.out.println();
        System.out.println(arr.equals(arr2));
        System.out.println(arr.toUpperCase());
    }
}
