import java.util.ArrayList;
import java.util.List;

public class SlicedPizza implements Pizza {

    private final int slices;
    private final Pizza pizza;
    List<Ingredient> ingredients = new ArrayList<>();
    double price;

    SlicedPizza(Pizza pizza, int number){
        this.slices = number;
        this.pizza = pizza;
        this.price = this.pizza.getPrice() + 2;
    }

    public int getSlices() {
        return slices;
    }

    @Override
    public boolean addIngredient(Ingredient ingredient) {
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
        this.price = price + 2;
    }

}
