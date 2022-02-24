package ro.ITSchool;

public class Circle {
    private double radius;
    private double pi;

    public Circle(double radius) {
        this.radius = radius;
        this.pi = 3.14;
    }

    public void areaCircle() {
        double area = Math.pow(radius, 2) * pi;
        System.out.println("The area of circle is " + area);
    }

}
