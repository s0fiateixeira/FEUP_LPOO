public class House implements HasArea{
    private final double area;

    House(double a){
        this.area = a;
    }

    @Override
    public double getArea() {
        return area;
    }
}
