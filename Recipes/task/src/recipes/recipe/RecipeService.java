package recipes.recipe;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    public List<Recipe> recipeList() {
        return  List.of(new Recipe("Fresh Mint Tea", "Light, aromatic and refreshing beverage, ...", "boiled water, honey, fresh mint leaves",
                "1) Boil water. 2) Pour boiling hot water into a mug. 3) Add fresh mint leaves. 4) Mix and let the mint leaves seep for 3-5 minutes. 5) Add honey and mix again."));
    }
    public void postNewRecipe(Recipe recipe) {
        System.out.println(recipe);
    }
}
