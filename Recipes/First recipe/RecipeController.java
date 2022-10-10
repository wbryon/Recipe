package recipes.recipe;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {
    Recipe currentRecipe = new Recipe();
    @PostMapping
    public void postRecipe(@RequestBody Recipe newRecipe) { currentRecipe = newRecipe; }
    @GetMapping()
    public Recipe getRecipe() { return currentRecipe; }
}
