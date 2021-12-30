import java.util.Scanner;

public class revstring {
    public static void main (String[] args) {
       
        String newstr="";
        char ch;
       System.out.print("Enter your Name : ");
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        newstr= ch+newstr;
      }
      System.out.println("Reversed Name : "+ newstr);
    }
}