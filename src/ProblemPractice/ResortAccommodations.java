package ProblemPractice;
/* @author: YOUR_NAME_HERE @version: 1.0 */

//importing Scanner from java util class
import java.util.Scanner;

public class ResortAccommodations {
    public static void main(String[] args) {
        // creating a scanner object to read user Input
        Scanner sc = new Scanner(System.in);

        //declaring two int variables
        // one to hold total number of rooms
        // other for total occupied rooms
        // and initialising them to 0

        int total_room=0, occupied_rooms = 0;

        //initialising number of floors to 1
        int number_of_floors = 0;

        // using while loop to ask user about
        // actual number of floors
        // and validating it to be >= 1

        while(number_of_floors<1)
        {
            System.out.print("How many floors does the resort have? ");
            number_of_floors = sc.nextInt();
            while(number_of_floors<1)
            {
                System.out.print("Invalid. Enter 1 or more: ");
                number_of_floors = sc.nextInt();
            }
        }

        for(int i=1;i<=number_of_floors;i++)
        {
            int rooms_on_each_floor;
            System.out.print("How many rooms does floor "+i+" have? ");
            rooms_on_each_floor = sc.nextInt();

            // using while loop to check if rooms on each floor>10
            while(rooms_on_each_floor<10)
            {
                System.out.print("Invalid. Enter 10 or more: ");
                rooms_on_each_floor = sc.nextInt();
            }

            //after successful validation of room on ith floor,
            //add it to total rooms
            total_room += rooms_on_each_floor;


            //------checking occupied rooms on each floor now-------//

            int occupied_rooms_on_each_floor =0;
            System.out.print("How many occupied rooms does floor "+i+" have? ");
            occupied_rooms_on_each_floor = sc.nextInt();

            /* using while loop to check if
            * occupied rooms < total room on that floor
            */

            while(occupied_rooms_on_each_floor>rooms_on_each_floor)
            {
                System.out.print("Invalid. Enter "+rooms_on_each_floor+" or less: ");
                occupied_rooms_on_each_floor = sc.nextInt();
            }

            occupied_rooms += occupied_rooms_on_each_floor;

        }

        // back to program

        // creating a variable to store number of vacant rooms
        int vacant_rooms = total_room - occupied_rooms;

        //using a double to store occupancy percentage
        double occupancy_rate = ((double)occupied_rooms/(double)total_room)*100.0;

        //outputs
        ///blank line
        System.out.println();

        //printing values now
        //variable names are self explanatory

        System.out.println("Number of rooms: "+total_room);
        System.out.println("Occupied rooms: "+occupied_rooms);
        System.out.println("Vacant rooms: "+vacant_rooms);
        System.out.printf("Occupancy rate: %.2f",occupancy_rate);
        System.out.print("%");



    }
}
