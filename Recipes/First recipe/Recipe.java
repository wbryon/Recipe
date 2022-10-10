package recipes.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@RestController
public class Recipe {

    private String name;
    private String description;
    private String ingredients;
    private String directions;

}
