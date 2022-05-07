public class programtwentyseven
{
    public static void main(String[] args) {
        programtwentyseven obj = new programtwentyseven();
        obj.sum(10, 29);
        obj.sum("a" , "b");
    }

    void sum(int a, int b) {
        System.out.println("Sum : " + (a + b));
    }

    void sum(String a , String b) {
        System.out.println("Letters are  " + (a + b));
    }

}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programtwentyseven  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
