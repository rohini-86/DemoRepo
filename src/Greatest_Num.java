public class Greatest_Num {
    public static void main(String[] args) {
        int num[]=new int [] {10,40,59,68,70,90,60,70};
        int small=num[0];
        int large=num[0];
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>large)
                large=num[i];
            else if(num[i]<small)
                small=num[i];
        }
        System.out.println("largest number is:"+ large);
        System.out.println("Small number is:"+ small);

    }
}
