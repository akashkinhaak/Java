import java.util.Scanner;

public class programtwelve

{
    public static void main(String[] args)
    {
        int marks , i;
        char grd;

        System.out.println("Enter Marks : ");

        //Creating Scanner Object
        Scanner s = new Scanner(System.in);

        marks = s.nextInt();

        i = marks/10;

        switch(i)
        {
            case 9:
            case 10:

            grd='A';
            break;

            case 8:
            case 7:

                grd='B';
                break;


            case 6:


                grd='C';
                break;



            case 5:


                grd='D';
                break;


            default:
                grd='E';
                break;

        }

        System.out.println("Your Grade is : "+grd);
    }
}

// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programtwelve  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
