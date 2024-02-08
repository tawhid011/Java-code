import java.util.Scanner;

public class LAB1_prob3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,r1,r2;
        System.out.println("Enter a, b, c: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();

        double dis=Math.pow(b,2)-4*a*c;

        if(dis>0)
        {
            r1=(-b+Math.pow(dis,0.5))/2*a;
            r2=(-b-Math.pow(dis,0.5))/2*a;

            System.out.println("The equation has 2 roots: "+r1+" and "+r2);


        }
        else if(dis==0)
        {
            r1=(-b+Math.pow(dis,0.5))/2*a;
            r2=(-b+Math.pow(dis,0.5))/2*a;

            System.out.println("The equation has 1 roots: "+r1);
        }
        else if(dis<0)
        {
            System.out.println("There are no real roots to this equation.");
        }


    }



}