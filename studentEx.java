public class studentEx{
    private String name;
    private int rollno;
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public int getrollno()
    {
        return rollno;
    }
    public void setrollno(int rollno)
    {
        this.rollno=rollno;
    }
    public String toString()
    {
        return "studentEx[Name: " + name + ", Roll Number: " + rollno + "]";
    }
}