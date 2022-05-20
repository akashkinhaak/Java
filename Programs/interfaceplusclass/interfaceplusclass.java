
public class interfaceplusclass
{

    public static void main(String[] args)
    {
        derivedclass2 dc = new derivedclass2();
        dc.print();
        dc.display();


    }

}
class test1
{
    void print()
    {
        System.out.println("Class Inherited");
    }
}

interface message2
{
    void  display();
}

class derivedclass2 extends  test1 implements message2
{

    public void display()
    {
        System.out.println("Interface Inherited");
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. interfaceplusclass Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
