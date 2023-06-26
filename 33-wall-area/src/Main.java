public class Main {
    public static void main(String args[]) {
        Wall wall = new Wall();
        System.out.println(wall.area());

        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.area());
    }
}