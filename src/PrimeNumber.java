public class PrimeNumber
{
    public static void main(String[] args)
    {
       int i,num=34,count=0;
   for(i=1;i<=num;i++)
            {

                if (num%i==0)
                {
                    count++;
                }
            }
    if(num==2)
            {
                System.out.print("Prime number");
            }
  else
            {
                System.out.print("Not a Prime number");
            }

        }

    }
