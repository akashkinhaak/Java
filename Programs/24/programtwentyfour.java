
public  class programtwentyfour
{

    public static void main(String[] args)
    {
        std s = new std();
        s.getData();
        s.display();
    }
}
class std
{

    int roll,age;
    void getData()
    {
     roll=01;
     age=16;
    }
    void  display()
    {
        System.out.println("Roll No. Is "+roll);
        System.out.println("Age Is "+age);
    }

}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programtwentyfour  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
