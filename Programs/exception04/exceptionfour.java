
public class exceptionfour
{
    public static void main(String[] args)
    {

        try
        {

            int result = 500/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally Block Executed");
        }
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program/Class  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
