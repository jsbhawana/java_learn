import java.util.Scanner;
class Mystring 
{
    int countconsonant=0;   
        int countvowel=0;
        int countdigit=0;
        int countspace=0;
        int countword=0;
        int countother=0;
    private String str;

    public void setString(String str) {
        this.str = str;
    }
    public void count() {
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    countvowel++;
                } else {
                    countconsonant++;
                }
            } else if (Character.isDigit(ch)) {
                countdigit++;
            } else if (Character.isSpaceChar(ch)) {
                countspace++;
            } else if (ch == '\n') {
                countword++;
            } else {
                countother++;
            }
        }
        countword = countspace + 1;
    }
}
public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mystring s = new Mystring();
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        s.setString(str);
        s.count();
        System.out.println("Vowels: " + s.countvowel);
        System.out.println("Consonants: " + s.countconsonant);
        System.out.println("Digits: " + s.countdigit);
        System.out.println("Spaces: " + s.countspace);
        System.out.println("Words: " + s.countword);
        System.out.println("Other characters: " + s.countother);
    }
}
