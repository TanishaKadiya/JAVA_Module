public class main{
    public static void main(String[] args){
        // student s1=new student();
        // s1.setName("John");
        // s1.setRollno(101);  
        // s1.setMarks(85);
        // System.out.println("Name: "+s1.getName());
        // System.out.println("Roll No: "+s1.getRollno());
        // System.out.println("Marks: "+s1.getMarks());
        //}
    //     car c1=new car();
    //     System.out.println(c1.startengine());
    //     System.out.println("Speed: "+c1.getSpeed());
    //     c1.accelerate();
    //     System.out.println("Speed: "+c1.getSpeed());
    //     c1.brake();
    //     System.out.println("Speed: "+c1.getSpeed());
    //     System.out.println(c1.stopengine());
    // }

        //    employee e1=new employee();
        //    e1.setname("Alice");
        //    e1.setid(123);
        //    e1.setsalary(20000);
        //    System.out.println("Name: "+e1.getname());
        //       System.out.println("ID: "+e1.getid());
        //         System.out.println("Salary: "+e1.getsalary());
        //         System.out.println("Annual Salary: "+e1.annualsalary());

        ATM a1=new ATM();
        a1.setpin(1234);
        a1.setbalance(10000);
        if(a1.verifypin(1334)){
            System.out.println("Pin validated");
            System.out.println("Current Balance: "+a1.getbalance());
            a1.withdraw(500);
            System.out.println("Balance after deposit: "+a1.getbalance());
            System.out.println("Balance after withdrawal: "+a1.getbalance());
        
}
}
}