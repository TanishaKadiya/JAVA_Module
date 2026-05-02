public class main1 {
    public static void main(String[] args)
    {
        circle c=new circle();
        c.setRadius(5);
        System.out.println("The area of the circle is: "+c.calculateArea());
        System.out.println("The circumference of the circle is: "+c.calculateCircumference());
        


        rectangle r=new rectangle();
        r.setLength(4);
        r.setWidth(2);
        System.out.println("The area of the rectangle is: "+r.calculateArea());
        System.out.println("The perimeter of the rectangle is: "+r.calculatePerimeter());

        System.out.println("********Personal details********") 
        
    }

}
