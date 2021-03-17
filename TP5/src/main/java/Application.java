public class Application {

    public static void main(String[] args){
        AreaAggregator a = new AreaAggregator();

        a.addShape(new Circle(5));
        a.addShape(new Circle(45));
        a.addShape(new Square(2));
        a.addShape(new Square(4));
        a.addShape(new Square(45));
        a.addShape(new Ellipse(2, 5));
        a.addShape(new Ellipse(3, 6));
        a.addShape(new Triangle(5, 5));
        a.addShape(new House(45));

        AreaStringOutputter stringOutputter = new AreaStringOutputter(a);
        //AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(a);

        System.out.println(stringOutputter.output());
        //System.out.println(xmlOutputter.output());

    }
}
