public class Circle {
    private double radius;

    public Circle(double radius){
        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }

    //get radius value
    public double getRadius(){
        return this.radius;
    }

    //calculate area
    public double area(){
        return this.radius * this.radius * Math.PI;
    }
}
