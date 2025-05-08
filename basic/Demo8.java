class Number {
    private int num;

    public void setNumber(int num) {
        this.num = num;
    }

    public int sumofOddDigit() {
        int sum = 0;
        int temp = num; // Use a local copy to preserve original value
        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 == 1) {
                sum += Math.pow(digit, 2); // You can cast to int if needed
            }
            temp = temp / 10;
        }
        return sum;
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Number n = new Number();
        n.setNumber(1234567890);
        System.out.println("Sum of Odd digit: " + n.sumofOddDigit());
    }
}
