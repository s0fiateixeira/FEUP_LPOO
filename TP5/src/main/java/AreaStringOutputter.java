public class AreaStringOutputter {

    private AreaAggregator area;
    AreaStringOutputter(AreaAggregator area){
        this.area = area;
    }

    String output(){
        return ("Sum of areas: " + area.sum());
    }

    public AreaAggregator getArea() {
        return area;
    }

    public void setArea(AreaAggregator area) {
        this.area = area;
    }
}
