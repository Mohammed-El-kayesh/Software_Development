
package faculty2;
public class CSStaff extends AbstractStaff
{
 @Override   
 Staff getStaff(String StaffName)
 {
     String s=StaffName.toLowerCase();
   switch (s)    
   {
    
    case"CSDoctor":
        return new CSDoctor();
    case"CSTeachingAssistant":
        return new CSTeachingAssistant();
    default:
        return null;
   }
   
 }
}
