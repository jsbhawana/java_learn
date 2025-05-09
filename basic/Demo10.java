import java.util.Scanner;
class Number {
    int num;
    Number(int num) {
        this.num = num;
    }
    public boolean isArmstrong() {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return originalNum == sum;
    }
}
public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNum = sc.nextInt();
        Number n = new Number(inputNum);
        if (n.isArmstrong()) {
            System.out.println(inputNum + " is an Armstrong number.");
        } else {
            System.out.println(inputNum + " is not an Armstrong number.");
        }
    }
}
