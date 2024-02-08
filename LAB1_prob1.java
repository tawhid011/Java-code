import java.util.Scanner;

public class LAB1_prob1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your number: ");
        double a=sc.nextDouble();

        if(a%3==0 && a%2==0)
        {
            System.out.println("FALSE");
        }
        else if(a%3==0 || a%2==0)
        {
            System.out.println("TRUE");
        }
        else System.out.println("FALSE");


    }
}
