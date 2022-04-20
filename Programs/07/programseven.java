import java.io.*;


public class programseven
{
    public static void main(String args[])throws Exception
    {
        String name;

        //Creating InputStreamReader
        InputStreamReader isr = new InputStreamReader(System.in);

        //Create BufferReader
        BufferedReader stdin = new BufferedReader(isr);

        // Promt The User
        System.out.println("Enter Your Name : ");

        //Use BufferedReader To Read The Line
        name = stdin.readLine();

        System.out.println("Hello "+name);
        System.out.println(name+ " You have Successfully Run it");
        System.out.println(name+ " It Is Printed Using InputStreamReader");
    }
}



// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programseven  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

