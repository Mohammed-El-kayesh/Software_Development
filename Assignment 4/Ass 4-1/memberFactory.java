package faculty;

public class memberFactory 
{
    public Staff getStaff(String memberName)
    {
        if (memberName==null)
        {
         return null;    
        }
        if (memberName.equalsIgnoreCase("TeachingAssistance"))
        {
            return new TeachingAssistant();
        }
        else if (memberName.equalsIgnoreCase("Doctor"))
        {
           return new Doctor();    
        }
        return null;
    }
}
