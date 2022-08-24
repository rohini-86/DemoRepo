



public class SingleInherit {
  public static void main(String[] args)  {
      Subject S=new Subject();
      S.student("Priya");
      S.addSubject("Chemistry");

  }
}
 class student {
   public void student(String name) {
      System.out.println("the name is "+name);

 }
}
class Subject extends student {
   public void addSubject(String subject){
    System.out.println("the subject is "+subject);
}
}