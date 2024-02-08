import java.util.Scanner;

public class LAB1_prob5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter co-ordinates of center: ");
        double p= sc.nextDouble();
        double q= sc.nextDouble();

        System.out.print("Enter radius: ");
        double r= sc.nextDouble();

        System.out.print("Enter co-ordinates to check: ");
        double check_p= sc.nextDouble();
        double check_q= sc.nextDouble();

        double x=p-check_p;
        double y=q-check_q;

        double diff=Math.pow((Math.pow(x,2)+Math.pow(y,2)),.5);

        if(diff>r)
        {
            System.out.println("OUTSIDE");
        }
        else System.out.println("INSIDE");
    }
}
