public class AreaXMLOutputter {

    private AreaAggregator area;
    AreaXMLOutputter(AreaAggregator area){
        this.area = area;
    }

    String output(){
        return ("<area>" + area.sum() + "</area>");
    }

    public AreaAggregator getArea() {
        return area;
    }

    public void setArea(AreaAggregator area) {
        this.area = area;
    }
}
