public class Practice
{

    //user-defined static method
    static void show()
    {
        System.out.println("This is a static method.");
    }
    //user-defined non-static method
    void display()
    {
        System.out.println("This is a non-static method.");
    }
    public static void main(String[] args)
    {
        //calling static method without using the object
       show();

        //creating an object of the class
        Practice fun=new Practice();
        //calling non-static method
        fun.display();
    }
}