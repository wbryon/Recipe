package recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class RecipesApplication {
    public static void main(String[] args) { SpringApplication.run(RecipesApplication.class, args);}

    @GetMapping("recipe")
    public List<Recipe> list() {
        return List.of(
                new Recipe("Fresh Mint Tea", "Light, aromatic and refreshing beverage, ...", "boiled water, honey, fresh mint leaves", "1) Boil water. 2) Pour boiling hot water into a mug. 3) Add fresh mint leaves. 4) Mix and let the mint leaves seep for 3-5 minutes. 5) Add honey and mix again.")
        );
    }
}