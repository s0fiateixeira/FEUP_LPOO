public class Line implements BasicShape{
    private double length;

    Line(double l){
        length = l;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
