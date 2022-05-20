
public class multilevelinheritance
{
        void Start()
        {
            System.out.println("Started Vehicle");
        }


        static class Vehicle extends inheritance.multilevelinheritance
        {
            void bike()
            {
                System.out.println("Vehicle IS Bike");
            }
            static class Speed extends inheritance.multilevelinheritance.Vehicle
            {
                void speed()
                {
                    System.out.println("Speed is 70");
                }
            }


        }

        public static void main(String[] args)
        {
            multilevelinheritance.Vehicle.Speed v = new multilevelinheritance.Vehicle.Speed();
            v.Start();
            v.bike();
            v.speed();
        }
    }


// Change Run Configuration ClassName To the program name while running the Program

// Step-1 Click On Configuration Icon Left To Run Button
// Step-2 Click On Edit Configuration
// Step-3 In Build and Run Section Type Name OF Program/Class  and Click on Apply then OK
// Step-4 Run Program Successfully
// Originally Developed BY Akash

