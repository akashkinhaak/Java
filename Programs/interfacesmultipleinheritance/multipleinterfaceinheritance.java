package interfaces_prorgram;

public class multipleinterfaceinheritance
{
    public static void main(String[] args)
    {
    mid m= new mid();
    m.disp();
    }
}
interface one
{
    void disp();
}
interface two
{
    void disp();
}
class mid implements one,two
{
    public void disp()
    {
        System.out.println("Multiple Inheritance");
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program/Class  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

