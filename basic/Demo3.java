import java.util.*;
class Temperature{
    private double cel;
    public void setData(double cel){
        this.cel=cel;
    }
    public void getData()
    {
        double farh;
        farh=(9*cel/5)+32;
        System.out.println("Equivalent Celcius temperature in farenheit is"+farh);
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr temperature in celcius");
        double cel=sc.nextDouble();
        Temperature t=new Temperature();
        t.setData(cel);
        t.getData();

    }
}
