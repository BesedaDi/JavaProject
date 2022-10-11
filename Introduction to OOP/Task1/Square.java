public class Square extends Figure {
    public String name;

    public Square(String name, float side) {
        super(side);
        this.name = name;
        this.side = side;
    }
    public void setValues(float _side){
        side = _side;
    }

    public void printInfo() {
        System.out.println("Фигура: " + this.name);
        System.out.println("Сторона: " + this.side);
    }

    public double calculateArea() {
        return Math.pow(this.side,2);
    }

    public double calculateP(){
        return this.side*4;
    }
}
