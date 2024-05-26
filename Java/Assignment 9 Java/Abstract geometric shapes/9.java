package assignment9;

public abstract class Shape {
    public abstract void calVolume();
}

package assignment9;

public class Sphere extends  Shape{

   private int r;

    public Sphere(int r) {
        this.r = r;
    }

    public Sphere() {
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void calVolume() {
        double result=(4/3)*(Math.PI)*(r*r);
        System.out.println(result);
    }
}


package assignment9;

public class Cylinder extends Shape{

    double r;
    double h;

    public Cylinder() {
    }

    public Cylinder(double h, double r) {
        this.h = h;
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void calVolume() {
        double result=(Math.PI)*r*r*h;
        System.out.println(result);
    }
}

package assignment9;

public class Cube extends Shape{

    int Int;

    public Cube(int Int) {
        this.Int = Int;
    }

    public Cube() {
    }

    public int getInt() {
        return Int;
    }

    public void setInt(int Int) {
        this.Int = Int;
    }

    @Override
    public void calVolume() {
    int result=Int*Int*Int;
        System.out.println(result);
    }
}
