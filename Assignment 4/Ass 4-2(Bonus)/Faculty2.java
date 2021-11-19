package faculty2;
public class Faculty2 {

    public static void main(String[] args)
    {
        FactoryProducer fp=new FactoryProducer();
        CSStaff cs = new CSStaff();
        AbstractStaff f1 = FactoryProducer.getStaff("CS");
      AbstractStaff f2 = FactoryProducer.getStaff("IS");
      AbstractStaff f3 = FactoryProducer.getStaff("IT");
      
        
        System.out.println(cs.getStaff("CSDoctor"));
      
    }
    
}
