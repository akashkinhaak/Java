
public class exceptionone
{
    public static void main(String[] args)
    {
        int a =100 , b= 0;
        int res=0;
        try
        {
            res = a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Occured");
            System.out.println(e);

        }
        System.out.println("Last Statement");
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program/Class  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
