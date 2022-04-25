import java.util.Scanner;

public class programfifteen
{
    public static void main(String[] args)
    {
        int a,b, num =0, den=0, rem=0, hcf=0, lcm=0;

        System.out.println(" Enter Two Numbers : ");

        // Creating Scanner Class
        Scanner s = new Scanner(System.in);

        a=s.nextInt();
        b=s.nextInt();

        if (a>b)
        {
          num=a;
          den=b;
        }
        else
        {
            num = b;
            den = a;
        }

        rem=num%den;
        while(rem!=0)
        {
            num=den;
            den=rem;
            rem=num%den;
        }


        hcf=den;
        lcm=(a*b)/hcf;

        System.out.println("LCM is : "+lcm);
        System.out.println("HCf is : "+hcf);



    }

}

// Second Program Of While


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programfifteen  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
