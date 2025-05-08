class Number{
    private int num;
    public void setNumber(int num){
        this.num = num;
    }
    public int getEvenDigitCount(){
        int count=0;
        while(num!=0)
        {
            int digit = num%10;
            if(digit%2==0)
            {
                count++;
            }   
            num=num/10;
        }
        return count;
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Number n = new Number();
        n.setNumber(1234567890);
        System.out.println("Even digit count: " + n.getEvenDigitCount());
    }
}
