
package faculty2;

public class ITStaff extends AbstractStaff
{
    @Override
    Staff getStaff(String StaffName)
 {
     String s=StaffName.toLowerCase();
   switch (s)    
   {
    
    case"IT Doctor":
        return new ITdoctor();
    case"IT Teaching Assistant":
        return new ITteachingAssistant();
    default:
        return null;
}
 }
}
