import java.util.Scanner;
public class programeleven
{
    public static void main(String args[])
    {
        int str;
        String name;
        String name2;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Name Of Person One");

        name= s.next();

        System.out.println("Enter Name Of Person Two");

        name2= s.next();

        System.out.println("Enter 1 to Print Name Of Person One Else Enter 2 to Print Name OF Person Two");

        str= s.nextInt();

        if(str==1)
        {
            System.out.println("Hello First Person is : "+name);

        }
        else if (str==2)
        {
            System.out.println("Hello Second Person is : "+name2);

        }


    }
}



// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programeleven  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
