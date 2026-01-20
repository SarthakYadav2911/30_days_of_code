import java.util.Scanner;
public class second {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        int n = str.length();
        System.out.println("Length of the string: " + n);
        sc.close();
    }
    
}
