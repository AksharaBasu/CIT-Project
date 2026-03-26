import java.util.Scanner;

public class LoanEligible {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int age;
         double loan;
         System.out.println("enter the age of consumer");
         age= sc.nextInt();
         if(age>=21)
            System.out.println("Grant the loan 250000");
        else
    System.out.println("Not eligible for Loan this "+age);
sc.close();

    }
}
