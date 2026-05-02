public class personal {
    public static void main(String[] args)
    {
        person p=new person();
        p.setname("John Doe");
        p.setage(30);
        p.setcountry("USA");
        System.out.println("Name: " + p.getname());
        System.out.println("Age: " + p.getage());
        System.out.println("Country: " + p.getcountry());
        
    }
    
}
