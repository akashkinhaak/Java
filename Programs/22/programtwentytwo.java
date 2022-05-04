
public class programtwentytwo {
    public static void main(String[] args) {


        int a[][] = {{1, 4, 6}, {4, 5, 3}};
        int b[][] = {{2, 1, 3}, {3, 4, 5}};

        int s[][] = new int[2][3];

        System.out.println("Elements of First matrix are: ");
        for (int r = 0; r < a.length; r++)
        {
            for (int c = 0; c < a[r].length; c++)
            {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();


        }

        System.out.println("Elements of second matrix are: ");
        for (int r=0; r<b.length; r++)
        {
            for (int c=0; c<b[r].length;c++)
            {
                System.out.print(b[r][c]+" ");

            }
            System.out.println();
            // move to next line
        }

        // find sum
        for (int r=0; r<b.length; r++)
        {
            for (int c=0; c<b[r].length;c++)
            {
                s[r][c]=a[r][c]+b[r][c];

            }


        }

        // displaying the result
        System.out.println("Resultant Matrix is : ");
        for (int r=0; r<s.length;r++)
        {
            for (int c=0; c<s[r].length;c++)
            {
                System.out.print(s[r][c]+" ");
            }
            System.out.println();
        }
    }
}




// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program i.e. programtwentytwo  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash
