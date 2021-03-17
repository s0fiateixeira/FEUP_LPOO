public class Triangle implements Shape{
    private double base;
    private double height;

    Triangle (double x, double y) {
        base = x;
        height = y;
    }


    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
}
