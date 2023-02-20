public class Cube extends ThreeDimensionalShape {
    double a = 3;

    @Override
    public double areaOfTheShape() {
        double area = 6 * Math.pow(a, 2);
        return area;
    }

    @Override
    public double volumeOfShape() {
        double volume = Math.pow(a,3);
        return volume;
    }


}
