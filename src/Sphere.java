public class Sphere extends ThreeDimensionalShape {
    double pi = 3.14;
    int r = 3;
    @Override
    public double areaOfTheShape() {
        double area = 4 * (pi * Math.pow(r, 2));
        return area;
    }

    @Override
    public double volumeOfShape() {
        double volume = 4 / 3 * (pi * Math.pow(r, 3));

        return volume;
    }
}
