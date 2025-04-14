public class Main2 {
    public static void main(String[] args) {
        GeometricShape circle = new Circle(5.0, "Красный", "Черный");
        GeometricShape rectangle = new Rectangle(4.0, 6.0, "Синий", "Белый");
        GeometricShape triangle = new Triangle(3.0, 4.0, 5.0, "Зеленый", "Желтый");
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
