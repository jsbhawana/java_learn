import java.util.Scanner;
class Namehandler{
  
    private String fullName;
    private String firstName;
    private String middleName;
     private String lastName;
    public void setString(String str) {
        this.fullName = str;
    }
    public void splitName() {
       int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");
       
        if (firstSpaceIndex == -1) {
            firstName = fullName;
            middleName = "";
            lastName = "";
        } else if (firstSpaceIndex == lastSpaceIndex) {
            firstName = fullName.substring(0, firstSpaceIndex);
             middleName = "No middle name";
            lastName = fullName.substring(firstSpaceIndex + 1);
           
        } else {
            firstName = fullName.substring(0, firstSpaceIndex);
             middleName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);
            lastName = fullName.substring(lastSpaceIndex + 1);
           
        }
    }
    public void displayName() {
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }

}
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Namehandler n = new Namehandler();
        System.out.println("Enter your full name:");
        n.setString(sc.nextLine());
        n.splitName();
        n.displayName();
        
    }
}
