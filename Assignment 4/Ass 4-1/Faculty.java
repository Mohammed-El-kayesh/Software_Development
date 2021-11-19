
package faculty;
import java.util.Scanner;
public class Faculty {

    
    public static void main(String[] args) 
    {
          Scanner input=new Scanner (System.in);
          memberFactory memFac=new memberFactory();
          System.out.println("Enter memeber type : ");
          String memberName = input.nextLine();
          Staff s =memFac.getStaff(memberName);
          s.getSalary();
          s.getYearsOfWork();
    }
    
}
