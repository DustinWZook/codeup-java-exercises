package shapes;
import util.Input;

public class Circle {
    private double radius;
    public Circle(){
        radius = Input.getDouble();
        System.out.println("radius: "+this.radius);
        System.out.println("Area: "+getArea());
        System.out.println("Circumference: "+getCircumference());
    }
    public double getArea(){
        return (Math.PI * (this.radius*this.radius));
    }
    public double getCircumference(){
        return (2 * Math.PI * this.radius);
    }

    public static void main(String[] args){
        System.out.println("enter the radius of the circle");
        Circle userCircle = new Circle();
    }
}
