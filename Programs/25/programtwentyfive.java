public class programtwentyfive
{
    public static void main(String[] args) {
        abc obj = new abc();
        abc obj2 = new abc();
        obj.setValue();

        int result =obj2.sum(obj);
        System.out.println("Sum is :"+result);

    }

}

class  abc
{
    int a,b;
    void setValue()
    {
        a=10;
        b=11;
    }

    int sum(abc x)
    {
       return (x.a + x.b);
    }

}

// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programtwentyfive  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
