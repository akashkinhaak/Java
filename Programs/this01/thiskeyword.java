package this_static_final_keyword;

public class thiskeyword
{
    public static void main(String[] args)
    {

        thiskeyword t = new thiskeyword(10);
        t.display();

    }

    int i;
    thiskeyword(int i)
    {
        this.i = i;
    }
    void display()
    {

        System.out.println(i);
    }
}



// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. thiskeyword  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

