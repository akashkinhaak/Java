package this_static_final_keyword;

public class finalkeyword
{

    int roll;
    final String college = "Nehru College";
    public static void main(String[] args)
    {

        finalkeyword s = new finalkeyword(16);
        s.display();

    }


    finalkeyword(int r)
    {

        roll=r;
    }


    void display()
    {
        System.out.println("Roll Number is : "+roll);
        System.out.println("College Name Is: "+college);
    }

}

// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. finalkeyword  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
