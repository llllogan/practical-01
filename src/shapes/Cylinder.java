package shapes;

public class Cylinder implements Shape{

    public double radius;
    public double height;


    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    public double volume() {

        return Math.PI * Math.pow(this.radius, 2) * this.height;

    }

    public double surfaceArea() {

        return 2 * Math.PI * this.radius * this.height + 2 * Math.PI * Math.pow(this.radius, 2);

    }


}
