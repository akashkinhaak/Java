package inheritance;

public class singlelevelinheritence
{
  void Start()
  {
      System.out.println("Started Vehicle");
  }


  static class vehicle extends singlelevelinheritence
  {
      void bike()
      {
          System.out.println("Vehicle IS Bike");
      }


  }
    public static void main(String[] args)
    {
        vehicle v = new vehicle();
        v.Start();
        v.bike();
    }
}


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program/Class  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

