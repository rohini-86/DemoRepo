class Phone {
    public void F1(int a) {

        System.out.println(a);
    }
}

class Features extends Phone {
    public void F1(Float f) {
        System.out.println(f);
    }


}

class Stable extends Features{
    public void F1(String str) {
        System.out.println(str);
    }
}


    class Main
    {
        public static void main(String[] args) {
            Stable P = new Stable();
            P.F1(12);
            P.F1(12.7f);
            P.F1("riya");



           //Upcasting
         /*   Features h = new Features();
            h.function();

            Phone n = new Phone();
            n.function();

          */
        }
    }
