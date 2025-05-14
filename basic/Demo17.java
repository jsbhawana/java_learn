import java.util.Scanner;

class Number {
    private int[] num = new int[10];

    public Number() {
        // Constructor initializes the array
    }

    public void inputData(Scanner sc) {
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
    }

    public int getMax() {
        int max = num[0];
        for (int i = 1; i < 10; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}

public class Demo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number n = new Number();
        n.inputData(sc);
        System.out.println("Maximum number is: " + n.getMax());
        sc.close();
    }
}
