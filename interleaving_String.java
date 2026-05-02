public class interleaving_String {
    public static void main(String[] args)
    {
        String s="WX";
        String s1="YZ";
        StringBuilder result=new StringBuilder();
        int i=0;
        while(i<s.length() || i<s1.length())
        {
            if(i<s.length())
            {
                result.append(s.charAt(i));
            }
            if(i<s1.length())
            {
                result.append(s1.charAt(i));
            }
            i++;
        }
        System.out.println("Interleaving string: "+result.toString());
    }
    
}
