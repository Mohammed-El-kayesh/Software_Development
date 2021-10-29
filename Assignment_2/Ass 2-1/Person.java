package assignment_2;
public class Person
{
     String name;
     String phone;
     String email;
     
     public Person(String name,String phone,String email)
     {
         this.name=name;
         this.phone=phone;
         this.email=email;
     }
    
     
      @Override
   public String toString()
   {
       return "class name is person and person name is"+name;
   }
}

