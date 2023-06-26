public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    //get height
    public double getHeight() {
        return this.height;
    }

    //get volume
    public double getVolume() {
        return height * area();
    }
}
