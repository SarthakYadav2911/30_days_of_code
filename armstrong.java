import java.util.Scanner;
public class armstrong {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        int count=0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        if (sum == originalNumber) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
        sc.close();
    }

}