package recipes.controller;

import org.springframework.web.bind.annotation.*;
import recipes.entity.Recipe;
import recipes.entity.RecipeID;

import java.util.*;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {

    RecipeID id = new RecipeID();
    public Map<RecipeID, Recipe> recipe = new HashMap<>();

    @PostMapping("/new")
    public void postRecipe(@RequestBody Map<RecipeID, Recipe> recipe) {
        this.recipe = recipe;
    }

    @GetMapping("/{id}")
    public Map<RecipeID, Recipe> getRecipe(@PathVariable int id) {
        if (this.id.getId() == id) {
            return recipe;
        }
        throw new RecipeNotFoundException("404 (Not found)");
    }
}