import java.util.*;
class Student
{
    private String name;
    private int roll;
    private double mark1, mark2;

    public void setDetail(String name, int roll, double mark1, double mark2)
    {
        this.name=name;
        this.roll=roll;
        this.mark1=mark1;
        this.mark2=mark2;
    }
    public void displayDetail()
    {
        double tot,pct;
        tot=mark1+mark2;
        pct=tot/2;
        System.out.println("Name="+name);
        System.out.println("Roll="+roll);
        System.out.println("Total="+tot);
        System.out.println("Percentage="+pct);

    }
}
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, roll and marks in two subjects.");
        String name=sc.nextLine();
        int roll=sc.nextInt();
        double m1=sc.nextDouble();
        double m2=sc.nextDouble();
        Student s=new Student();
        s.setDetail(name,roll,m1,m2);
        s.displayDetail();
    }
}
