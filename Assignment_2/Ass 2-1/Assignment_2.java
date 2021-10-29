
package assignment_2;


public class Assignment_2 {

    
    public static void main(String[] args) {
     Student s=new Student();
     Employee e=new Employee();
     Faculty f=new Faculty();
     stuff st=new stuff();
    Date d=new Date();
     System.out.println(s.name+"\n"+s.phone+"\n"+s.email+"\n"+s.status);
        System.out.println(s.toString());
     System.out.println(e.name+"\n"+e.phone+"\n"+e.email+"\n"+e.office+"\n"+e.salary+"\n"+e.office+"\n"+e.datehired);
        System.out.println(e.toString());
     System.out.println(f.name+"\n"+f.officehours+"\n"+f.rank);
        System.out.println(f.toString());
     System.out.println(st.title);
        System.out.println(st.toString());
     System.out.println(d.day+"/"+d.month+"/"+d.year);
    }
    
}
