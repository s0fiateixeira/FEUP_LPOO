import java.util.ArrayList;
import java.util.List;

public class MargueritaRecipe extends Recipe {

    private final List<Ingredient> ingredients;

    MargueritaRecipe(){
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Tomato"));
        ingredients.add(new Ingredient("Mozzarella"));
        ingredients.add(new Ingredient("Basil"));
    }

    @Override
    Pizza makeMediumPizza(){
        return new MediumPizza(ingredients);
    }
}
