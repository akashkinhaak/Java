    import java.util.Scanner;

    public class programfive
    {

        public static void main(String args[])
        {
            int str;


            Scanner s = new Scanner(System.in);

            System.out.println("Enter 1 for PYRAMID  OR  3 for Triangle");

            str= s.nextInt();

            if(str<2)
            {
                System.out.println("    "+str);
                System.out.println("   "+str+str+str);
                System.out.println("  "+str+str+str+str+str);
                System.out.println(" "+str+str+str+str+str+str+str);
                System.out.println(""+str+str+str+str+str+str+str+str+str+"");
            }
            if(str>2)
            {
                System.out.println("    "+"T");
                System.out.println("   "+"T"+" "+"T");
                System.out.println("  "+"T"+" "+" "+" "+"T");
                System.out.println(" "+"T"+" "+" "+" "+" "+" "+"T");
                System.out.println(""+"T T T T T"+"");
            }

        }
    }



// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programfive  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

