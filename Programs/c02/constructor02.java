package constructor_programs;

public class constructortwo
{
    public static void main(String[] args)
    {
          constructortwo c2 = new constructortwo(1, 1);
          c2.display();
    }

    int rollno , cls ;
    constructortwo(int a , int b)
    {
        rollno = a;
        cls = b ;
    }

    void display()
    {
        System.out.println("Roll Number is : "+rollno);
        System.out.println("Class  is : "+cls);
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. constructor02  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
