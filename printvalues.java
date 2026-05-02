public class printvalues {
    void printvalue(int a, char c)
    {
        System.out.println("Integer: "+a+ " Character: "+c);
    }
    void printvalue(char c, int a)
    {
        System.out.println("Character: "+c+ " Integer: "+a);
    }
    public static void main(String[] args)
    {
        printvalues p = new printvalues();
        p.printvalue(20,'T');
        p.printvalue('T',20);
    }
    
}
