import java.util.Scanner;

class programninteen {
    public static void main(String[] args) {
        int row, i, j, k, n;
        System.out.println("Enter the no. pyramid lines");

        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (row = 1; row <= n; row++) {
            for (i = 0; i <= n - row; i++)
                System.out.print(" ");
            for (j = 1; j <= row; j++)
                System.out.print(j);
            for (k = row - 1; k >= 1; k--)
                System.out.print(k);
            System.out.print("\n");
        }
    }
}

// Loop Within Loop

// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programninteen  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
