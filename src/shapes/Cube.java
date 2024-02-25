package shapes;

public class Cube implements Shape {

    public double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    public double volume() {

        return Math.pow(this.edge, 3);

    }

    public double surfaceArea() {

        return 6 * Math.pow(this.edge, 2);

    }
    
}
