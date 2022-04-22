import java.util.Scanner;


public class programnine


{

    public static void main(String args[])
    {
        int str;
        String name;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Name");

        name= s.next();

        System.out.println("Enter 1 to Print Your Name");

        str= s.nextInt();

        if(str==1)
        {
            System.out.println("Hello "+name);

        }


    }
}



// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programnine  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

