import java.util.Scanner;

public class programfour
{

    public static void main(String args[])
    {
        String str;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter A Number you want to Make Pyramid With : ");

        str=s.next();

        System.out.println("    "+str);
        System.out.println("   "+str+str+str);
        System.out.println("  "+str+str+str+str+str);
        System.out.println(" "+str+str+str+str+str+str+str);
        System.out.println(str+str+str+str+str+str+str+str+str);
    }
}



// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programfour  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
