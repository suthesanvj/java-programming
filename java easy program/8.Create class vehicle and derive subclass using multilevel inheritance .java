class AreaCalculator {
    public static double calculateArea(double side) {
        return side * side;
    }
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static double calculateArea(double radius, String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return Math.PI * radius * radius;
        } else {
           
            System.out.println("Unknown shape: " + shape);
            return 0;
        }
    }

    public static void main(String[] args) {
        
        double squareArea = calculateArea(5.0);

      double rectangleArea = calculateArea(4.0, 6.0);
        double circleArea = calculateArea(3.0, "circle");

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
OUTPUT:
Area of Square: 25.0
Area of Rectangle: 24.0
Area of Circle: 28.274333882308138
