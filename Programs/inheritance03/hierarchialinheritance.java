
public class hierarchialinheritance
{
    public static void main(String[] args)
    {
        hierarchialinheritance.base.h1 a= new hierarchialinheritance.base.h1();
        a.display0();
        a.display1();
        hierarchialinheritance.base.h2 b= new hierarchialinheritance.base.h2();
        b.display0();
        b.display2();
    }

    String n1,n2;
    static class base
    {
        void display0()
        {
            System.out.println("Base Class");
        }
        static class h1 extends hierarchialinheritance.base
        {
            void display1()
            {
                System.out.println("Hierarchial First");
            }
        }
        static class h2 extends hierarchialinheritance.base
        {
            void display2()
            {
                System.out.println("Hierarchial Second");
            }
        }
    }
}

// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program/Class  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

