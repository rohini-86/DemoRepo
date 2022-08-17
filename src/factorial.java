import java.net.SocketOption;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter any nymber");

        int num,i,fact=1;
        num=obj.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
