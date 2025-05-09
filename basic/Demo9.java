import java.util.Scanner;
class Number {
    int num;
    Number(int num) {
        this.num = num;
    }
    public boolean isPalindrome() {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNum = sc.nextInt();
        Number n = new Number(inputNum);
        if (n.isPalindrome()) {
            System.out.println(inputNum + " is a palindrome.");
        } else {
            System.out.println(inputNum + " is not a palindrome.");
        }
    }
}
