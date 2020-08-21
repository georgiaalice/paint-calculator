package paintcalculator;

public class Calculations {
    private static final double METRES_SQUARED_PER_LITRE = 16.0;

    public int calculateAreaOfFloor(int width, int length) {
        return width * length;
    }

    public int calculateAmountOfPaintRequired(int width, int length, int height) {
        int areaOfWalls = (width + width + length + length) * height;

        return (int) Math.ceil(areaOfWalls / METRES_SQUARED_PER_LITRE);
    }

    public int calculateVolumeOfRoom(int width, int length, int height) {
        return width * length * height;
    }

}