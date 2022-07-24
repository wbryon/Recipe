package recipes.entity;

import lombok.Data;

@Data
public class RecipeID {
    private int id;
    private static int idCounter = 0;

    public RecipeID() {
        this.id = ++idCounter;
    }
}