import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter any nymber1");
        System.out.println("Enter any nymber21                ");
        int a;
        int b;
        a=obj.nextInt();
        b=obj.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
System.out.println("value of a is"+a);
        System.out.println("value of b is"+b);
    }
}
