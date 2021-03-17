public class Ellipse extends Shape {
    private double xRadius;
    private double yRadius;

    Ellipse (double x, double y) {
        xRadius = x;
        yRadius = y;
    }

    public double getxRadius() {
        return xRadius;
    }

    public double getyRadius() {
        return yRadius;
    }

    public void setxRadius(double xRadius) {
        this.xRadius = xRadius;
    }

    public void setyRadius(double yRadius) {
        this.yRadius = yRadius;
    }
}
