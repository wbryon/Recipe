package recipes.recipe;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) { this.recipeService = recipeService; }

    @PostMapping
    public void postRecipe(@RequestBody Recipe recipe) { recipeService.postNewRecipe(recipe); }

    @GetMapping()
    public List<Recipe> list() { return recipeService.recipeList(); }
}