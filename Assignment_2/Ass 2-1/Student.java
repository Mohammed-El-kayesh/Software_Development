package assignment_2;
public class Student extends Person
{
     final String status="freshman";

    public Student()
    {
     super("Ali","01055221","ali@gmail.com");
    }
   

   
     
      @Override
   public String toString()
   {
      return "class name is student and person name is"+name;
   }
   }
}
