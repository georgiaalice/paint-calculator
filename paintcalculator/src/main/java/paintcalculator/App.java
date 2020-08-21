package paintcalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculations calculations = new Calculations();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the width of the room in metres:");
        int width = in.nextInt();

        System.out.println("Enter the length of the room in metres:");
        int length = in.nextInt();

        System.out.println("Enter the height of the room in metres:");
        int height = in.nextInt();

        in.close();

        int floorArea = calculations.calculateAreaOfFloor(width, length);
        int paintRequired = calculations.calculateAmountOfPaintRequired(width, length, height);
        int volumeOfRoom = calculations.calculateVolumeOfRoom(width, length, height);

        System.out.println("Area of the floor: " + floorArea + " metres squared");
        System.out.println("Amount of paint required to paint the walls: " + paintRequired + " litres");
        System.out.println("Volume of the room: " + volumeOfRoom + " metres cubed");

    }
}
