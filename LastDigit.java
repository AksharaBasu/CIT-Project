import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num =sc.nextInt();
        int lastdigit=num%10;
        System.out.println("output "+lastdigit);
    }
    
}
