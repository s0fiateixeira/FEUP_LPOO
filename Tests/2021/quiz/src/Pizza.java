import java.util.List;

public interface Pizza {
    boolean addIngredient(Ingredient ingredient);
    List<Ingredient> getIngredients();
    int getIngredientCount();
    double getPrice();
    void setPrice(double price);
}
