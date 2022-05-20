
public abstract class abstractclass
{
    abstract void display();
}
class  derived extends abstractclass
{
    void display()
    {
        System.out.println("Abstract Class Run Successfully");
    }

    public static void main(String[] args)
    {
        derived x = new derived();
        x.display();
    }

}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program/Class  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

