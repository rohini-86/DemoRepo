public class PatternTwo {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int j = 2 * i - 2; j <= 2 * 4 - 2; j++)
            {
                System.out.println(" ");
            }
            for (int j = 1; j <= 1; j++)
            {
                System.out.println("*");
            }
        }
    }
}

