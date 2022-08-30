//class Detail is defined to store the details. sub class Bill is to compute the monthly telephone charge of the customer 
import java.io.*;
class Detail
{
    String name;
    String address;
    String telno;
    double rent;
    Detail(String n, String a, String t, double r)
    {
        name=n;
        address=a;
        telno=t;
        rent=r;
    }
    void show()
    {
        System.out.println();
        System.out.println("Customer");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone: " + telno);
    }
}
public class Bill extends Detail
{
    int n;
    double amt;
    Bill(String Name, String a, String t, double r, int N)
    {
        super(Name, a, t, r);
        n=N;
        amt=0.0;
    }
    void cal()
    {
        if(n>0 && n<=100)
        {
            amt=rent;
        }
        if(n>100 && n<=200)
        {
            amt=rent+(0.60*n);
        }
        if(n>200 && n<=300)
        {
            amt=rent+(0.80*n);
        }
        if(n>300)
        {
            amt=rent+n;
        }
    }
    void show()
    {
        super.show();
        System.out.println("Number of calls: " + n);
        System.out.println("Amount to be paid: " + amt);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter name");
        String Name= br.readLine();
        System.out.println("Enter address");
        String adr= br.readLine();
        System.out.println("Enter Telephone number");
        String Tno= br.readLine();
        System.out.println("Enter Number of calls");
        int num= Integer.parseInt(br.readLine());
        Bill ob = new Bill();
        ob.cal();
        ob.show();
    }
}