public class programtwentysix
{
    public static void main(String[] args)
    {
        programtwentysix obj =  new programtwentysix();
        obj.sum(10,29);
        obj.sum(10,29,30);
    }


    void sum(int a, int b)
    {

        System.out.println("Sum : " + (a + b));
    }

    void sum(int a, int b, int c)
    {
        System.out.println("Sum : " + (a + b + c));
    }

}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programtwentysix  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
