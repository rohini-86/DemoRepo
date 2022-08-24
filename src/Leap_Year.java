import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        {
            int year;
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Please Enter any year you wish: ");
            year = sc.nextInt();
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.format(" is a Leap Year."+ year);
            } else {
                System.out.format(" is NOT a Leap Year."+ year);
            }
        }
    }
}