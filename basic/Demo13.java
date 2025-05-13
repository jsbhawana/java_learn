import java.util.Scanner;
class MyString {
    private String str;
    public void setString(String str) {
        this.str = str;
    }
    public void removevowels() {
    
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                System.out.print(ch);
            }
        }
    
    }
}

public class Demo13 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyString s = new MyString();
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        s.setString(str);
        System.out.println("String after removing vowels:");
        s.removevowels();

   }
}
