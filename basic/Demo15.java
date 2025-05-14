import java.util.Scanner;
class AlternateCase{
    private String str;
    private StringBuilder result = new StringBuilder();
    public void setString(String str) {
        this.str = str;
    }
    
    public void convertToAlternateCase() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
    }
    
    public void displayResult() {
        System.out.println("Converted String: " + result.toString());
    }
}
public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlternateCase ac = new AlternateCase();
        System.out.println("Enter a string:");
        ac.setString(sc.nextLine());
        ac.convertToAlternateCase();
        ac.displayResult();
    }
}
