package constructor_programs;

class constructorone
{
    public static void main(String[] args)
    {
        constructorone c = new constructorone();
        c.display();
    }
    int a, b;
    constructorone()  // Constructor Defined Here
    {
        a = 0;
        b = 3;
    }

    void display()
    {
        System.out.println("First Variable is : "+a);
        System.out.println("Second Variable is : "+b);

    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. constructor01  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
