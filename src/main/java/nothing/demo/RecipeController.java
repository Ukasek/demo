package nothing.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RecipeController {
    private RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/przepis")
    public String details(@RequestParam String nazwa, Model model) {

        Recipe recipe = recipeRepository.findByName(nazwa);
        if (recipe != null) {
            model.addAttribute("recipe", recipe);
            return "recipe";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "home";
    }
}
