
package faculty2;

public class ISStaff extends AbstractStaff
{
    @Override
    Staff getStaff(String StaffName)
 {
     String s=StaffName.toLowerCase();
   switch (s)    
   {
    case"IS Doctor":
        return new ISDoctor();
    case"IS Teaching Assistant":
        return new ISTeachingAssistant();
        default:
            return null;
   }
 }
}
