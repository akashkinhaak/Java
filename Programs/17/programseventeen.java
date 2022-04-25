import java.util.Scanner;
public class programseventeen
{
        public static void main(String[] args)
        {
            int num, digit=0, temp=0, rnum=0;
            System.out.println("Enter a integer");

            Scanner s=new Scanner(System.in);

            num =s.nextInt();
            temp = num;

            do
            {
                digit=temp%10;
                temp=temp/10;
                rnum=rnum*10+digit;
            }
            while (temp>0);

            if (rnum==num){
                System.out.println("The Number is a palindrome ");}

            else{
                System.out.println("The Number is not a palindrome ");
            }
        }


}

// Second Program Of DO WHILE

// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programseventeen  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
