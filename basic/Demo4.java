import java.util.*;
class Calculator{
    private double num1,num2;
    public void setData(double num1,double num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    public void getCalc()
    {
        double sum,sub,mul,div;
        sum=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        System.out.println("The calculation are as follows");
        System.out.println("Addition= "+sum);
        System.out.println("Subtraction= "+sub);
        System.out.println("Multiplication= "+mul);
        System.out.println("Division= "+div);
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two positive number");

        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        Calculator c= new Calculator();
        c.setData(n1, n2);

        c.getCalc();
    }
}
