import java.io.*;
class Worker
{
   String name;
   double salary = 0.0;
   Worker(String n, double s)
   {
     name = n; 
     salary = s;
    }
   void printEmp()
   {
      System.out.println("Name = " + name);
      System.out.println("Salary = " + salary);
    }
}
public class Manager extends Worker 
{
   Manager(String n, double s)
   {
      super(n,s); 
    }
   void raiseSalary(int percentage)
   {
      salary = (salary * percentage)/100;
   }
   void display()
   {
     System.out.println("Raised Salary = " + salary);
   }
   public static void main(String args[])throws Exception
   {
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       Manager m = new Manager("abc",1000000);
       m.printEmp();
       m.raiseSalary(5);
       m.display();
   }
} 