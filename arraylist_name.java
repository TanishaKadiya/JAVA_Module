import java.util.Scanner;
public class arraylist_name {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=s.nextInt();
        String[] names=new String[size];
        System.out.println("Enter the names:");
        for(int i=0;i<size;i++)
        {
            names[i]=s.next();
        }
        System.out.println("Entered names are:");
        for(int i=0;i<size;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println("Total number of students stored: "+size);
    }
    
}




// question 3)
// object oriented programming language are programming language that are based on the concept of objects.
// Objects are the instance of classes ehich contain data and methods.
// The main 4 pillars of object oriented programming language are:
// 1) Encapsulation: it is the process of wrapping data and method into a single unit called class.
// 2) Inheritance: in inheritance the properties of one class are inherited by another class. It conatins parent:child relationship.
// 3) Polymorphism: It is the ability of an object to take many forms. 
//                  There are two types of polymorphism: compile time polymorphism and runtime polymorphism.
// 4) Abstraction: It is the process of hiding the implementation details and showing only the functionality to the user.



// Difference between string and string buffer:
// String is immutable while StringBuffer is mutable.
// String is slower than StringBuffer.
// String is stored in string pool while StringBuffer is stored in heap memory.


// Difference between list and set:
// list allows duplicate entry while set does not allow duplicate entry.
// list maintains the order of insertion while set does not maintain the order of insertion.


