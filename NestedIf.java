import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
        int age = 65;
        if(age>18){
        if(age>=65){
            System.out.println("Eligible to avail govement fund");
        }else
                System.out.println("we are not eligible for vote and avail govement scheme ");

        } 
        else
            System.out.println("we are not eligible to vote");
        sc.close();

        }
        
    
    }

        
    
    

