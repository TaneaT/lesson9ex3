public class Circle extends TwoDimensionalShape {

    @Override
    public double areaOfShape() {
        double pi = 3.14;
        int r = 2;
        double area = pi * Math.pow(r, 2);

        return area;
    }
}
