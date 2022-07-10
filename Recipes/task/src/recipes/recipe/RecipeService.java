package recipes.recipe;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

//    List<Recipe> list;

//    public RecipeService() {
//        list = new ArrayList<>();
//        list.add((Recipe) recipeList());
//    }
    public List<Recipe> recipeList() {
        return List.of(new Recipe("1", "2", "3", "4"));
    }
    public void postNewRecipe(Recipe recipe) {
        recipeList().add(recipe);
    }
}
