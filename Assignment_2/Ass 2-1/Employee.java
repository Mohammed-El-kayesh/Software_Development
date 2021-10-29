package assignment_2;

import java.util.Date;

public class Employee extends Person 
{
   String office="office boy";
   double salary=3500;
   String datehired="10/2/2020";
   
   
   public Employee()
    {
     super("ahmed","0125865","ahmd@gmail.com");
    }
 
   @Override
   public String toString()
   {
       return "class name is employee and the peron name is"+name;
   }
}
