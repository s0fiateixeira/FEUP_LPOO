import java.util.ArrayList;
import java.util.List;

public class MediumPizza implements Pizza {

    List<Ingredient> ingredients = new ArrayList<>();
    double price;

    MediumPizza(){};

    MediumPizza(List<Ingredient> ingredients){
        this.ingredients = ingredients;
        this.price = 0;
    }

    @Override
    public boolean addIngredient(Ingredient ingredient){
        for (Ingredient value : ingredients) {
            if (value.equals(ingredient)) {
                return false;
            }
        }
        ingredients.add(ingredient);
        return true;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public int getIngredientCount() {
        return ingredients.size();
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

}
