class Number{
    private int num;
    public void setNumber(int num){
        this.num = num;
    }
    public int sumofOddDigit(){
        int sum=0;
        while(num!=0)
        {
            int digit = num%10;
            if(digit%2==1)
            {
                sum=sum+digit;
            }   
            num=num/10;
        }
        return sum;
    }
}
public class Demo7 {
    public static void main(String[] args) {
        Number n = new Number();
        n.setNumber(1234567890);
        System.out.println("Sum of Odd digit: " + n.sumofOddDigit());
    }
}
