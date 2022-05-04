import java.util.Scanner;
public class programtwentythree
{
    public static void main(String[] args)
    {
        int a[][] = new int[3][];
        a[0]=new  int[3];
        a[1]=new  int[4];
        a[2]=new  int[2];

        //Scanner object
        Scanner s = new Scanner(System.in);

        for (int r=0; r<a.length; r++)
        {
        System.out.println("Enter Elements of Row "+(r+1));

        for (int c=0;c<a[r].length;c++)
        {
            a[r][c]=s.nextInt();
        }
        System.out.println();

        }
        // Display Result
        System.out.println("Elements of jagged array are: ");
        for (int r=0;r<a.length;r++)
        {
            for (int c=0; c<a[r].length; c++)
            {
                System.out.print(a[r][c]+" ");

            }
            System.out.println();
        }


    }
}



// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programtwentythree  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
