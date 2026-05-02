public class employee {
    private String name;
    private int id;
    private double salary;
    public void setsalary(double salary)
    {
        this.salary=salary;
    }
    public double getsalary()
    {
        return salary;
    }
    public double annualsalary()
    {
        return salary*12;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public int getid()
    {
        return id;
    }
    public void setid(int id)
    {
        this.id=id;
    }
}
