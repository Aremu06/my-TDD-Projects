public class Square extends Shape{
    double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public Square(String color, String blue, Object side) {
        super(color, blue, side);
    }

    @Override
    double area() {
        return Math.pow(side, 2);
    }

    @Override
    String info() {
        return "I'm a " + super.color + "square and my are is " + area();
    }
}
