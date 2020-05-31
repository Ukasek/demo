package nothing.demo;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class RecipeRepository {
    private Set<Recipe> recipeSet;

    public RecipeRepository() {
        recipeSet = new HashSet<>();
        recipeSet.add(new Recipe("Kurczak po azjatycku", "Chrupiący kurczak w sosie słodko-kwaśnym", 1.0, "/kurczak.jpeg"));
        recipeSet.add(new Recipe("Gołąbki", "Pyszne gołąbki w sosie pomidorowym", 2.5, "/golabki.jpg"));
        recipeSet.add(new Recipe("Sushi z łososiem", "Wędzony łosoś zawijany w nori ", 2.0, "/sushi.jpg"));
        recipeSet.add(new Recipe("Pierogi z mięsem", "Pierogi z ciasta pszennego z farszem wieprzowym", 1.5, "/pierogi.jpg"));
    }

    public Recipe findByName(String nazwa) {
        for (Recipe recipe : recipeSet) {
            if (recipe.getName().equals(nazwa))
                return recipe;
        }
        return null;
    }

    public Set<Recipe> findAll() {
        return recipeSet;
    }
}
