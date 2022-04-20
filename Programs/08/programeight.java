import  java.io.*;

public class programeight


{
    public static void main (String[] args)throws Exception
    {
        String s1,s2;
        int a,b,sum;
        InputStreamReader isr=new InputStreamReader(System.in);

        BufferedReader stdin=new BufferedReader(isr);

        System.out.println("Don't Use Space");
        System.out.println("Enter two numbers");

        s1=stdin.readLine();
        s2=stdin.readLine();
        a=Integer.parseInt(s2);
        b=Integer.parseInt(s1);
        sum= a+b;

        System.out.println("Sum="+ sum);

    }
}



// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programeight  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

