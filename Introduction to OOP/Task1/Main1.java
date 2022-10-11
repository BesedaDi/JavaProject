public class Main1 {
    public static void main(String[] args){
        Circle circle1 = new Circle("Круг", 1);
        System.out.println(circle1.calculateArea());
        circle1.setValues(3);
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculateP());
        circle1.printInfo();
        System.out.println("");

        Square square1 = new Square("Квадрат", 2);
        square1.setValues(2);
        System.out.println(square1.calculateArea());
        square1.setValues(3);
        System.out.println(square1.calculateArea());
        System.out.println(square1.calculateP());
        square1.printInfo();
        System.out.println("");

        Rectangle rectangle1 = new Rectangle("Прямоугольник", 2,4);
        System.out.println(rectangle1.calculateArea());
        rectangle1.setValues(3, 8);
        System.out.println(rectangle1.calculateArea());
        rectangle1.printInfo();
        System.out.println("");
    }

}
