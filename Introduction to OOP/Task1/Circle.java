public class Circle extends Figure {
    public String name;

    public Circle(String name, float side) {
        super(side);
        this.name = name;
    }
    public void setValues(float _side){
        side = _side;
    }

    public void printInfo() {
        System.out.println("Фигура: " + this.name);
        System.out.println("Диаметр: " + this.side);
    }

    public double calculateArea() {
        return 3.14*Math.pow((this.side/2),2);
    }

    public double calculateP(){
        return 2*3.14*(this.side/2);
    }
}
