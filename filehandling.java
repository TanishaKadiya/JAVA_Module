public class filehandling {
    public static void main(String[] args)
    {
        File file=new File("addBy");
        if(file.exists())
        {
            System.out.println("The file already exists.");
            System.out.println("file name:"+file.getName());
            System.out.println("file path:"+file.getAbsolutePath());
            System.out.println("file size:"+file.length()+"bytes");
            System.out.println("Is the file readable?"+file.canRead());
            System.out.println("Is the file writable?"+file.canWrite());
        }     
        else
        {
            System.out.println("The file does not exist.");
        }
    }
    
}
