public class MyClass {

    public static void main(String[] args){
        String color = null;
        Object radius = null;
        var v1 = 5.0;
        double v = v1;
        Circle circle = new Circle(color,"Red", radius);
        System.out.println(circle.info());

        Object side = null;
        var v2 = 10.0;
        Square square = new Square( color,"Blue", side);
        System.out.println(square.info());
        }

    }

