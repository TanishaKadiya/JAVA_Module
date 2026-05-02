public class printArea {
    void area_rect(int l, int b)
    {
        int area=l*b;
        System.out.println("Area of rectangle is: "+area);
    }
    void area_square(int s)
    {
        int area=s*s;
        System.out.println("Area of square is: "+area);
    }
    public static void main(String[] args)
    {
        printArea obj = new printArea();
        obj.area_rect(4,7);
        obj.area_square(6);
    }
    
}
