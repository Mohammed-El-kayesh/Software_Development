
package faculty2;

public class FactoryProducer 
{
 public static AbstractStaff getStaff(String StaffName)
 {
     if (StaffName.equalsIgnoreCase("CS"))
     {
         return new CSStaff();
     }
     else if (StaffName.equalsIgnoreCase("IS")) 
     {
          return new ISStaff();
     }
     else if (StaffName.equalsIgnoreCase("IT"))
     {
           return new ITStaff();
     }
     return null;
 }

   
}
