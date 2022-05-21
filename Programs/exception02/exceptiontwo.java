
public class exceptiontwo
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30};
        int total =0;
        try
        {
            total=a[0]+a[1]+a[2]+a[3];

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index Range");
            System.out.println(e);
        }
        System.out.println("Total Marks : " +total);
        System.out.println("Last Statement");
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program/Class  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
