package Com.week10.day36;
public class SumThreeArgs {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=3;i++){
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("The Sum of three numbers is "+sum);
    }
}
