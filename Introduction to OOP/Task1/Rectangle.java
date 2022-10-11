public class Rectangle extends Figure {
    public String name;
    public float side2;

    public Rectangle(String name, float side, float side2) {
        super(side);
        this.side2 = side2;
        this.name = name;

    }
    public void setValues(float _side, float _side2) {
        side = _side;
        side2 = _side2;
    }

    public void printInfo() {
        System.out.println("Фигура: " + this.name);
        System.out.println("Высота: " + this.side);
        System.out.println("Ширина: " + this.side2);
    }

    public double calculateArea() {
        return side*side2;
    }

    public double calculateP(){
        return 2*side+2*side2;
    }
}
