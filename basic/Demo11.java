class Mystring{
    private String str;
    public void setString(String str){
        this.str = str;
    }
    public Boolean isPalindrome(){
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--){
            char ext=str.charAt(i);
            rev=rev+ext;
        }
        if (rev.equalsIgnoreCase(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class Demo11 {
    public static void main(String[] args) {
        Mystring s = new Mystring();
        s.setString("Madam");
        if (s.isPalindrome()) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
