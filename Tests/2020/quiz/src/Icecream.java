import java.util.ArrayList;
import java.util.List;

public class Icecream {

    private List<Flavor> flavors;

    Icecream(){
        this.flavors = new ArrayList<>();
    }

    void addScoop(Flavor f){
        flavors.add(f);
    }

    int getScoopCount(){
        return flavors.size();
    }

    boolean contains(String flavor){
        for (int i = 0; i < flavors.size(); i++)
        {
            if (flavor.equals(flavors.get(i).getName())) return true;
        }
        return false;
    }

    long getFlavorCount(){
        if (flavors.isEmpty()) return 0;

        List<Flavor> finalList = new ArrayList<>();
        finalList.add(flavors.get(0));

        for (int i = 0; i < flavors.size(); i++)
        {
            for (int j = 0; j < finalList.size(); j++) {
                if (!(flavors.get(i).getName()).equals(finalList.get(j).getName())) {
                    finalList.add(flavors.get(i));
                } else break;
            }
        }
        return finalList.size();
    }

    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    void takeScoop(){
        flavors.remove(flavors.size()-1);
    }

}
