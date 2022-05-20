

public class simpleinterface
{

    public static void main(String[] args)
    {
        derivedclass dc = new derivedclass();
        dc.display();
    }

}
interface message
{
    void  display();
}

class derivedclass implements message
{

    public void display()
    {
        System.out.println("Printed Interface");
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. simpleinterface Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
