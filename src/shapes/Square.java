package shapes;

public class Square extends Quadrilateral{
    public Square(double i) {
        super(i ,i);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }


//    protected double side;
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//    public double getArea() {
//        return side * side;
//    }
//    public double getPerimeter() {
//        return 4 * side;
//    }
}
