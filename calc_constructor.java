class add
{
    int a;
    int b;
    add(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int add()
    {
        return a+b;
    }
}
class sub extends add
{
    sub(int a,int b)
    {
        super(a,b);
    }
    public int sub()
    {
        return a-b;
    }
}
class mul extends sub
{
    mul(int a,int b)
    {
        super(a,b);
    }
    public int mul()
    {
        return a*b;
    }
}
class div extends mul
{
    div(int a,int b)
    {
        super(a,b);
    }
    public int div()
    {
        return a/b;
    }
}
public class calc_constructor {
    public static void main(String[] args) {
        add a=new add(10,5);
        System.out.println("The sum of a and b is: "+a.add());
        sub s=new sub(10,5);
        System.out.println("The difference of a and b is: "+s.sub());
        mul m=new mul(10,5);
        System.out.println("The product of a and b is: "+m.mul());
        div d=new div(10,5);
        System.out.println("The quotient of a and b is: "+d.div());
        

}
