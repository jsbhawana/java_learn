import java.util.Scanner;
class UpperCase{
    private String str;
    private StringBuilder result = new StringBuilder();
    public void setString(String str) {
        this.str = str;
    }
    
    public void convertToUpperCase() {
        boolean capitalizeNext = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                result.append(ch);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
    } 
    public void displayResult() {
        System.out.println("Converted String: " + result.toString());
    }
}
public class Demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UpperCase uc = new UpperCase();
        System.out.println("Enter a string:");
        uc.setString(sc.nextLine());
        uc.convertToUpperCase();
        uc.displayResult();
    }
}
