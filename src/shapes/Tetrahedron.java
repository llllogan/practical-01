package shapes;
import java.lang.Math;

public class Tetrahedron implements Shape{

    private double edge;
    
    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    public double volume() {

        return (Math.pow(edge, 2))/(6 * Math.sqrt(2));

    }

    public double surfaceArea() {

        return (Math.sqrt(3) * Math.pow(edge, 2));

    }











}
