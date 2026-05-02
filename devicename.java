
public class devicename {
    public static void main(String[] args)
    {
         devicename device=new devicename();
         device.setname("fan");
         System.out.println("The name of the device is: "+device.getname());}
        private String name;
        public String getname()
        {
            return name;
        }
        public void setname(String name)
        {
            this.name=name;
        }

    }
    

