public class  Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color, String red, Object radius) {
        super(color, red, radius);
    }

    @Override
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    String info(){
        return "Im a " + super.color + "Circle and my are is " + area();
    }

}
