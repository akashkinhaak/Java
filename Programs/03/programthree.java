import java.util.Scanner;

class programthree
{

    public static void main(String args[])
    {
        //Reference String
        String name;
        //Initialise the Scanner
        Scanner s =new Scanner(System.in);

        //Print The Text
        System.out.println("Enter Your Name : ");

        // Get String Value
        name = s.next();

        // Printing The Final OutPut
        System.out.println("Hello "+name);
        System.out.println("How are you "+name);
        System.out.println(name+ " you have successfully Printed the Output");
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programthree  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
