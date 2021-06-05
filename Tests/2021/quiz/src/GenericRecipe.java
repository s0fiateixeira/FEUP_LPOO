import java.util.List;

public class GenericRecipe extends Recipe{
    private final List<Ingredient> ingredients;

    GenericRecipe(List<Ingredient> ingredients){
        this.ingredients = ingredients;
    }

    @Override
    Pizza makeMediumPizza() {
        return new MediumPizza(ingredients);
    }
}
