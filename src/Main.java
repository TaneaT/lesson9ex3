public class Main extends Shape{
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("Area of the circle is: " + circle.areaOfShape());

        Square square = new Square();
        System.out.println("Area of the square is: " + square.areaOfShape());

        Sphere sphere = new Sphere();
        System.out.println("Area of the sphere is: " + sphere.areaOfTheShape());
        System.out.println("Volume of the square is: " + sphere.volumeOfShape());

        Cube cube = new Cube();
        System.out.println("Area of the cube is: " + cube.areaOfTheShape());
        System.out.println("Volume of the cube is: " + cube.volumeOfShape());










    }
}