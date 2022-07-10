package recipes.recipe;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api/recipe")
public class RecipeController {
    Recipe recipe;
    @PostMapping("/api/recipe")
    public void postRecipe(@RequestBody Recipe recipe) { this.recipe = recipe; }
    @GetMapping("/api/recipe")
    public Recipe getRecipe() { return recipe; }
}