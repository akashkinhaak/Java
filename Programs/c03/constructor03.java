package constructor_programs;

public class constructorthree
{
    public static void main(String[] args)
    {
        constructorthree c1= new constructorthree();
        constructorthree c2= new constructorthree(c1);

        c1.display();
        c2.display();

    }

    int rollnum,cls;
    constructorthree()
    {
        rollnum= 16;
        cls= 3;
    }
    constructorthree(constructorthree c)
    {
        rollnum = c.rollnum;
        cls = c.cls;
    }

    void display()
    {
        System.out.println("Roll Number is : "+rollnum);
        System.out.println("Class  is : "+cls+"rd Year");
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. constructor03  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
