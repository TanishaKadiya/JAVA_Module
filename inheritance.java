class A{
    void disp()
    {
        System.out.println("This is a parent class");
    }
}
class B extends A{
        void disp()
        {
            System.out.println("This is a child class");
        }
    public static void main(String[] args)
    {
        A obj = new A();
        obj.disp();
        B obj1 = new B();
        obj1.disp();
        A obj2 = new B();
        obj2.disp();
    }
}