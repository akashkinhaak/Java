import java.util.Scanner;

public class programtwentyone
{
    public static void main(String[] args)

    {

        int m1, m2, m3, m4, m5 ;
        Scanner s =new Scanner(System.in);

        System.out.println("Enter Marks of Subject One : ");
        m1 = s.nextInt();

        System.out.println("Enter Marks of Subject Second : ");
        m2 = s.nextInt();

        System.out.println("Enter Marks of Subject Third : ");
        m3 = s.nextInt();

        System.out.println("Enter Marks of Subject Fourth : ");
        m4 = s.nextInt();

        System.out.println("Enter Marks of Subject Fifth : ");
        m5 = s.nextInt();

        System.out.println("Making Array");

        int marks[] = {m1, m2, m3, m4, m5};
        System.out.println("Marks are as below : ");

        System.out.println("Marks of Subject one is : "+marks[0]);
        System.out.println("Marks of Subject second is : "+marks[1]);
        System.out.println("Marks of Subject third is : "+marks[2]);
        System.out.println("Marks of Subject fourth is : "+marks[3]);
        System.out.println("Marks of Subject fifth is : "+marks[4]);
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programtwentyone  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
