package recipes.recipe;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
//@RequestMapping
public class RecipeController {
    HashMap <Integer, Recipe> recipe = new HashMap<>();
    @PostMapping("/api/recipe/new")
    public void postRecipe(@RequestBody HashMap <Integer, Recipe> recipe) { this.recipe = recipe; }
    @GetMapping("/api/recipe/{id}")
    public HashMap <Integer, Recipe> getRecipe(@PathVariable int id) {
        return recipe; }
}